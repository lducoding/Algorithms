package Hash;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Disguise {
    public static void main(String[] args) {
        String [][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"},{"mask","face"},{"helmet","face"}};
        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<String,Integer>();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
        }

        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()) {
            answer *= (it.next().intValue()+1);
        }

        answer -= 1;
        return answer;
    }
}