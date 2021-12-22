package Hash;

import java.util.*;
import java.util.stream.Collectors;

public class BestAlbum {
    public static void main(String[] args) {
        String genre[] = {"classic", "pop", "classic", "classic", "pop"};
        int plays[] = {500, 600, 150, 800, 2500};
        System.out.println(solution(genre,plays));
    }

    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        ArrayList<String> rankList = new ArrayList<String>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < genres.length; i++) {
            map.put(genres[i],map.getOrDefault(genres[i],0)+plays[i]);
        }
        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()) {
            list.add(it.next().intValue());
        }
        Collections.sort(list,Collections.reverseOrder());

        for (int val : list) {
            String keyList =  getKey(map, val);
            rankList.add(keyList);
        }

        for(String rank : rankList) {
            for (int i = 0; i < genres.length; i++) {

            }
        }
        System.out.println(rankList);

        return answer;
    }

    public static <K, V> K getKey(Map<K, V> map, V value) {

        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}
