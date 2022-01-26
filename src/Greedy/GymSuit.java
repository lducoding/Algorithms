package Greedy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class GymSuit {
    public static void main(String[] args) {
        int n = 7;
        int[] lost = {1,2,4,5};
        int[] reserve = {2,3,5};
        System.out.println(solution(n,lost,reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n];
        int answer = n;

        for (int l : lost) {
            student[l-1]--;
        }
        for (int r : reserve) {
            student[r-1]++;
        }

        for (int i = 0; i < student.length; i++) {
            if(student[i] == -1) {
                if(i-1>=0 && student[i-1] == 1) {
                    student[i]++;
                    student[i-1]--;
                } else if(i+1<student.length && student[i+1] == 1) {
                    student[i]++;
                    student[i+1]++;
                } else {
                    answer--;
                }
            }
        }

        return answer;
    }
}
