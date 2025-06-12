package study.string;

import java.util.Scanner;

public class One_08_ReverseSameText {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String word = in.nextLine();

    String answer = "YES";

    int lt = 0;
    int rt = word.length() - 1;

    word = word.toLowerCase();

    char[] chars = word.toCharArray();

    while (lt < rt) {
      if (!Character.isAlphabetic(chars[lt])) {
        lt++;
      } else if (!Character.isAlphabetic(chars[rt])) {
        rt--;
      } else {
        if (chars[lt] != chars[rt]) {
          answer = "NO";
          break;
        }
        lt++;
        rt--;
      }
    }
    System.out.println(answer);
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
