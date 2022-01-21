package FullSearch;

import java.util.HashSet;

public class FindSosu {
    public static void main(String[] args) {
        String numbers = "17";
        //String numbers = "011";
        System.out.println(solution("17"));
    }

    static HashSet<Integer> set = new HashSet<>();
    public static int solution(String numbers) {
        int answer = 0;
        recursive("", numbers);
        return answer;
    }

     static void recursive(String comb, String others) {
        if(!comb.equals("")) {
            set.add(Integer.valueOf(comb));
        }
        for (int i = 0; i < others.length(); i++) {
            String o1 = comb+others.charAt(i);
            String o2 = others.substring(0,i)+others.substring(i+1);
            recursive(o1, o2);
        }
    }
}
