package Sort;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HIndex {
    public static void main(String[] args) {
        int[] citations= {30,9,60,10,50};
        //int[] citations= {3,0,6,1,5};
        System.out.println(solution(citations));
    }

    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length-i;

            if(citations[i] >=h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}
