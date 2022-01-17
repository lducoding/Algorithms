package Sort;

import java.util.Arrays;
import java.util.Comparator;

public class BiggestNumber {
    public static void main(String[] args) {
        //int[] numbers = {6, 10, 2};
        int[] numbers = {3, 30, 34, 5, 9};
        System.out.println(solution(numbers));
        System.out.println("31000".compareTo("310"));
        System.out.println((1/10)%10);
    }

    public static String solution(int[] numbers) {
        String answer = "";
        int count = 0;
        String[] sList =  new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            sList[i] = Integer.toString(numbers[i]);
        }
        Arrays.sort(sList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        System.out.println(Arrays.toString(sList));
        if(sList[0].equals("0")) {
            return "0";
        }
        for (int i = 0; i < sList.length; i++) {
            answer += sList[i];
        }
        return answer;
    }
}