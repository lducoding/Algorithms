package Hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BestAlbum {
    public static void main(String[] args) {
        String genre[] = {"classic", "pop", "classic", "pop", "classic", "classic"};
        int plays[] = {400, 600, 150, 2500, 500, 500};
        System.out.println(solution(genre,plays));
    }

    public static int[] solution(String[] genres, int[] plays) {

        int[] answer = {};
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        for(int i = 0; i < genres.length; i++) {
            map.put(genres[i],map.getOrDefault(genres[i],0)+plays[i]);
        }

        ArrayList<String> rankList = new ArrayList<>();
        while(map.size()!=0) {
            String max_gen = "";
            int max_play = -1;
            for (String gen : map.keySet()) {
                if(map.get(gen) > max_play) {
                    max_gen = gen;
                    max_play = map.get(gen);
                }
            }
            rankList.add(max_gen);
            map.remove(max_gen);
        }
        System.out.println(rankList);

        ArrayList<BestSong> resultList = new ArrayList<>();
        for (String gen : rankList) {
            ArrayList<BestSong> semiResult = new ArrayList<>();
            for (int i = 0; i < genres.length; i++) {
                if(gen.equals(genres[i])) {
                    semiResult.add(new BestSong(genres[i],plays[i],i));
                }
            }
            
        }

        return answer;
    }

}
class BestSong {
        String gen = "";
        int play = 0;
        int idx = 0;

        public BestSong(String gen, int play, int idx) {
            this.gen = gen;
            this.play = play;
            this.idx = idx;
        }
}
