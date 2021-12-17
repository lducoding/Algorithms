package Hash;

import java.util.Arrays;
import java.util.HashMap;

public class Hash_NotFinish {
    public static void main(String[] args) {
//        String participant[] = {"leo", "kiki", "eden"};
//        String completion[] = {"kiki", "eden"};
//        System.out.println(solution(participant,completion));
        String[] aa = {"a","b"};
        HashMap<String, Integer> map = new HashMap<>();
        map.put("aa",2);
        System.out.println(map.getOrDefault("aaa",1));
        System.out.println(map);
    }

    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for (i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[i];
    }

    public static String solution2(String[] participant, String[] completion) {
        HashMap<String, Integer> hm = new HashMap<>();

        for(String key : participant) {
            hm.put(key,hm.getOrDefault(key,0)+1);
        }
        for (String key2 : completion) {
            hm.put(key2,hm.getOrDefault(key2,0)-1);
        }
        for(String key3 : participant) {
            if(hm.get(key3)!=0) {
                return key3;
            }
        }
        return "";
    }
}



