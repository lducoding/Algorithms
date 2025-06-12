package study.string;

import java.util.Scanner;
import java.util.regex.Pattern;

public class One_09_OnlyNumber {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String word = in.nextLine();

    String s = word.replaceAll("[^0-9]", "");

    System.out.println(Integer.parseInt(s));
    return;
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
