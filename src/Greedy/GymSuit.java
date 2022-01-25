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
        n -= lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);


        for (int i = 0; i < lost.length; i++) {
            if (Arrays.binarySearch(reserve, lost[i]) >= 0) {
                reserve[Arrays.binarySearch(reserve, lost[i])] = -1;
                lost[i] = -1;
                n++;
            }
        }

        for (int i = 0; i < lost.length; i++) {
            if(lost[i] != -1) {
                for (int j = 0; j < reserve.length; j++) {
                    if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j] ) {
                        reserve[j] = -1;
                        lost[i] = -1;
                        n++;
                    }
                }
            }
        }

        return n;
    }
}
