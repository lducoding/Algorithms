package kakao;

import java.util.HashMap;
import java.util.Map;

class Mbti {

    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println(solution(survey, choices));
    }

    public static String solution(String[] survey, int[] choices) {
        StringBuilder mbti = new StringBuilder();

        Map<Character, Integer> map = new HashMap();
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);

        for (int i = 0; i < survey.length; i++) {
            char[] chars = {survey[i].charAt(0), survey[i].charAt(1)};
            int score = (choices[i] - 4);
            if(score> 0) {
                map.replace(chars[1], map.get(chars[1]) + score);
            } else {
                map.replace(chars[0], map.get(chars[0]) + Math.abs(score));
            }
        }

        if(map.get('R') >= map.get('T')) {
            mbti.append('R');
        } else {
            mbti.append('T');
        }
        if(map.get('C') >= map.get('F')) {
            mbti.append('C');
        } else {
            mbti.append('F');
        }
        if(map.get('J') >= map.get('M')) {
            mbti.append('J');
        } else {
            mbti.append('M');
        }
        if(map.get('A') >= map.get('N')) {
            mbti.append('A');
        } else {
            mbti.append('N');
        }


        return mbti.toString();
    }

}
