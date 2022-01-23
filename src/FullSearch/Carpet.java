package FullSearch;

import java.util.ArrayList;
import java.util.Arrays;

public class Carpet {
    public static void main(String[] args) {
        int brown = 18;
        int yellow = 6;
        System.out.println(Arrays.toString(solution(brown,yellow)));
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < total+1; i++) {
            if( (total % i) == 0 ) {
                list.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>2) {
                int yel = (list.get(i) -2) * ( (total/list.get(i))-2 );
                if(yellow == yel) {
                    int num1 = list.get(i);
                    int num2 = total / list.get(i);
                    if(num1 > num2) {
                        answer[0] = num1;
                        answer[1] = num2;
                    } else {
                        answer[0] = num2;
                        answer[1] = num1;
                    }
                    return answer;
                }
            }
        }
        return answer;
    }
}
