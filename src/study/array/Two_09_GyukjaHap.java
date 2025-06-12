package study.array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Two_09_GyukjaHap {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int[][] arr = new int[size][size];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        arr[i][j] = in.nextInt();
      }
    }

    int answer = Integer.MIN_VALUE;


    for (int i = 0; i < size; i++) {
      int sum1=0;
      int sum2=0;
      for (int j = 0; j < size; j++) {
        sum1 += arr[i][j];
        sum2 += arr[j][i];
      }
      answer = Math.max(answer, sum1);
      answer = Math.max(answer, sum2);
    }
    int sum1=0;
    int sum2=0;
    for (int i = 0; i < size; i++) {
      sum1 += arr[i][i];
      sum2 += arr[i][size-i-1];
    }
    answer = Math.max(answer, sum1);
    answer = Math.max(answer, sum2);

    System.out.println(answer);

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
