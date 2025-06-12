package study.array;

import java.util.Scanner;

public class Two_06_ReverseSosu {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int[] nums = new int[size];
    int[] results = new int[size];
    for(int i = 0; i < size; i++) {
      nums[i] = in.nextInt();
    }
    for(int i = 0; i < size; i++) {
      StringBuffer sb = new StringBuffer(String.valueOf(nums[i])).reverse();
      int reverseNum = Integer.parseInt(sb.toString());
      if(isSosu2(reverseNum)) {
        results[i] = reverseNum;
      }
    }

    for (int n : results) {
      if(n != 0) System.out.print(n+" ");
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
