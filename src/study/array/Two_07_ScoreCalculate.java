package study.array;

import java.util.Scanner;

public class Two_07_ScoreCalculate {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int[] nums = new int[size];
    int score = 0;
    for (int i = 0; i < size; i++) {
      nums[i] = in.nextInt();
    }

    int seqScore = 1;
    for (int i = 0; i < size; i++) {
      if (i > 0) {
        if (nums[i] == 1) {
          if (nums[i - 1] == 1) {
            score = score + seqScore++;
            score++;
          } else {
            score++;
          }
        } else {
          seqScore = 1;
        }
      } else {
        if (nums[i] == 1) {
          score++;
        }
      }
    }
    System.out.println(score);
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
