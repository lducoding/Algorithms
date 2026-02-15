package Greedy;

import java.util.HashMap;
import java.util.Map;

public class GreedyTest {

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.solution("JAZ")); // 11
    System.out.println(solution.solution("JAN")); // 23
  }

  static class Solution {

    public int solution(String name) {
      Map<String, Integer> alphabetMap = new HashMap<>();
      alphabetMap.put("A", 0);  alphabetMap.put("B", 1);  alphabetMap.put("C", 2);
      alphabetMap.put("D", 3);  alphabetMap.put("E", 4);  alphabetMap.put("F", 5);
      alphabetMap.put("G", 6);  alphabetMap.put("H", 7);  alphabetMap.put("I", 8);
      alphabetMap.put("J", 9);  alphabetMap.put("K", 10); alphabetMap.put("L", 11);
      alphabetMap.put("M", 12); alphabetMap.put("N", 13); alphabetMap.put("O", 12);
      alphabetMap.put("P", 11); alphabetMap.put("Q", 10); alphabetMap.put("R", 9);
      alphabetMap.put("S", 8);  alphabetMap.put("T", 7);  alphabetMap.put("U", 6);
      alphabetMap.put("V", 5);  alphabetMap.put("W", 4);  alphabetMap.put("X", 3);
      alphabetMap.put("Y", 2);  alphabetMap.put("Z", 1);

      int alphabetChangeCount = 0;
      int length = name.length();

      int minMove = length - 1;

      for (int i = 0; i < length; i++) {
        // 상하 이동 점수 누적
        alphabetChangeCount += alphabetMap.get(name.substring(i, i + 1));

        int next = i + 1;
        while (next < length && name.charAt(next) == 'A') {
          next++;
        }

        // 경로 1: 순방향으로 가다가 되돌아서 뒤쪽부터 공략 (0 -> i -> 0 -> 뒤쪽)
        minMove = Math.min(minMove, i * 2 + length - next);

        // 경로 2: 처음부터 뒤쪽을 먼저 공략하고 다시 앞으로 오기 (0 -> 뒤쪽 -> 0 -> i)
        minMove = Math.min(minMove, (length - next) * 2 + i);
      }

      return alphabetChangeCount + minMove;
    }
  }
}