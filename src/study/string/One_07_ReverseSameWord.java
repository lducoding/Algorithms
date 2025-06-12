package study.string;

import java.util.Scanner;

public class One_07_ReverseSameWord {

  public static void mainMy(String[] args) {
    Scanner in = new Scanner(System.in);
    String word = in.nextLine();

    StringBuffer sb = new StringBuffer(word);

    if (word.equalsIgnoreCase(sb.reverse().toString())) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    return;
  }

  public String solution(String str) {
    String answer = "YES";

    str = str.toLowerCase();

    for (int i = 0; i < str.length() / 2; i++) {
      if(str.charAt(i) != str.charAt(str.length()-1-i)) return "NO";
    }

    return answer;
  }

  public static void main(String[] args) {
    One_07_ReverseSameWord T = new One_07_ReverseSameWord();
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();

    System.out.println(T.solution(str));
  }
}
