package Hash;

import java.util.*;

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

        System.out.println("value로 key 구해야함");


        return answer;
    }
}
