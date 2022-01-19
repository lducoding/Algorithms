package FullSearch;

import java.util.ArrayList;
import java.util.Arrays;

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
        int ck = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < supoza.length; i++) {
            int count = 0;
            for (int j = 0; j < answers.length; j++) {
                int chk = ((j+1) % supoza[i].length) -1;
                if(chk<0) {
                    if(supoza[i][(supoza[i].length-1)] == answers[j]) {
                        count++;
                    }
                } else {
                    if(supoza[i][chk] == answers[j]) {
                        count++;
                    }
                }
            }
            if(ck<=count) {
                ck = count;
                list.add(i+1);
            }
        }
        return list;
    }
}
