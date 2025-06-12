package study.string;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class One_06_NoDuplicateChar {

  public static void mainMy(String[] args) {
    Scanner in = new Scanner(System.in);
    String word = in.nextLine();

    String answer = "";

    Set<String> set = new LinkedHashSet<>();

    for (char c : word.toCharArray()) {
      set.add(String.valueOf(c));
    }

    System.out.println(set.stream()
        .collect(Collectors.joining()));
    return;
  }

  public String solution(String str) {
    String answer = "";

    char[] chars = str.toCharArray();

    for (int i = 0; i < chars.length; i++) {
      if(i == str.indexOf(chars[i])) {
          answer += chars[i];
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    One_06_NoDuplicateChar T = new One_06_NoDuplicateChar();
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();

    System.out.println(T.solution(str));
  }
}
