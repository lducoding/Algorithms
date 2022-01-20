package FullSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PracticeExam {
    public static void main(String[] args) {
        //int[] answers = {1,2,3,4,5};
        //int[] answers = {1,3,2,4,2};
        int[] answers = {3, 3, 2, 1, 5};
        System.out.println(solution(answers));
    }

    public static ArrayList<Integer> solution(int[] answers) {
        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,2,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
        //수포자1  1,2,3,4,5
        //수포자2  2,1,2,3,2,4,2,5
        //수포자3  3,3,1,1,2,2,4,4,5,5
        int[][] supoza = {supo1,supo2,supo3};
        int[] count = new int[3];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < supoza.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if(supoza[i][j % supoza[i].length] == answers[j]) {
                    count[i]++;
                }
            }
        }
        int max = Math.max(count[0],Math.max(count[1],count[2]));
        for (int i = 0; i < count.length; i++) {
            if(max == count[i]) {
                list.add(i+1);
            }
        }
        return list;
    }
}
