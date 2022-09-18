package Practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StationInstallation {
    public static void main(String[] args) {
        int[] stations = {2,5,9};
        int solution = solution(11, stations, 1);
        System.out.println(solution);
    }

    public static int solution(int n, int[] stations, int w) {
        int answer = 0;
        int startsNum = 1;
        for (int i : stations) {
            if((i -w) > startsNum) {
                int between = (i - w) - startsNum;
                if(between % ((w*2)+1) == 0) {
                    answer += between / ((w*2)+1);
                } else {
                    answer += between / ((w*2)+1);
                    answer++;
                }
            }
            startsNum = i+w+1;
        }
        if(startsNum <= n) {
            int between = n-(startsNum-1);
            if(between % ((w*2)+1) == 0) {
                answer += between / ((w*2)+1);
            } else {
                answer += between / ((w*2)+1) + 1;
            }
        }
        return answer;
    }
}
