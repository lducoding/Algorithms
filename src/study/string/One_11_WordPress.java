package study.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class One_11_WordPress {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String word = in.nextLine();

    word += " ";
    int count = 1;
    char target = ' ';
    String answer = "";
    for (int i = 0; i < word.length(); i++) {
      if(target != word.charAt(i)) {
        target = word.charAt(i);
        if(count > 1) answer += count;
        answer += word.charAt(i);
        count = 1;
      } else {
        count++;
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
