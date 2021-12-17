package Hash;

import java.util.*;

public class Disguise {
    public static void main(String[] args) {
        String [][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"},{"mask","face"},{"helmet","face"}};
        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) {
        int answer = 0;

        answer += clothes.length;
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        ArrayList<String> list = new ArrayList<>();


        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
            if(!list.contains(clothes[i][1])) {
                list.add(clothes[i][1]);
            }
        }

        for (int i = 2; i <= map.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                int flag = 1;
                flag *= map.get(list.get(j));
                for (int k = j+1; k < list.size() ; k++) {
                    flag *= map.get(list.get(k));
                }
                answer += flag;
            }
        }


        System.out.println(map);
        return answer;
    }
}