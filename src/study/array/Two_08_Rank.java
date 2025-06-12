package study.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Two_08_Rank {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int[] list = new int[size];
    List<Integer> scoreList = new ArrayList<>();
    Map<Integer, Integer> scoreMap = new LinkedHashMap<>();

    for (int i = 0; i < size; i++) {
      int num = in.nextInt();
      list[i] = num;
      scoreList.add(num);
      scoreMap.put(num,0);
    }

    scoreList.sort(Comparator.reverseOrder());

    for (Integer score : scoreList) {
      scoreMap.put(score, scoreList.indexOf(score)+1);
    }

    for (int num : list) {
      System.out.print(scoreMap.get(num)+" ");
    }
    return;
  }

  public static boolean isSosu2(int number) {
    boolean flag = true;

    if(number == 2) flag = true;
    if(number == 1) flag = false;

    for(int i = 2; i <= Math.sqrt(number); i++) {
      if(number % i == 0) flag = false;
    }

    return flag;
  }

  public static boolean isSosu(int number) {
    boolean flag = true;

    if (number == 2) flag = true;

    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) return false;
    }
    return flag;
  }



  public String solution(String str) {
    String answer = "YES";

    str = str.toLowerCase();

    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        return "NO";
      }
    }

    return answer;
  }

//  public static void main(String[] args) {
//    One_08_reverseSameText T = new One_08_reverseSameText();
//    Scanner kb = new Scanner(System.in);
//    String str = kb.nextLine();
//
//    System.out.println(T.solution(str));
//  }
}
