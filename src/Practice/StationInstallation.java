package Practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StationInstallation {
    public static void main(String[] args) {
        int[] stations = {9};
        int solution = solution(16, stations, 2);
        System.out.println(solution);
    }

    public static int solution(int n, int[] stations, int w) {
        int answer = 0;
        int count = 0;
        List<Integer> integerList = new ArrayList<>();
        List<Integer> rangeList = new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            integerList.add(i);
        }
        for (int i : stations) {
            IntStream.rangeClosed(i-w, i+w).forEach(o -> integerList.remove(Integer.valueOf(o)));
        }
//        for (int i : stations) {
//            for (int j = i-w; j <= i+w; j++) {
//                integerList.remove(Integer.valueOf(j));
//            }
//        }
        for (int i = 0; i < integerList.size(); i++) {
            if(i != integerList.size()-1 && integerList.get(i) + 1 == integerList.get(i+1)) {
                count++;
            } else {
                count++;
                rangeList.add(count);
                count = 0;
            }
        }
        for (int i : rangeList) {
            if(i%((w*2)+1) == 0 ) {
                answer += i/((w*2)+1);
            } else {
                answer += i/((w*2)+1) +1;
            }
        }
        return answer;
    }
}
