package study.string;

import java.util.Scanner;

public class One_12_Amo {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int wordLength = Integer.parseInt(in.nextLine());
    String word = in.nextLine();


    String splitWord = "";
    String answer = "";
    for (int i = 0; i < word.length(); i++) {
      splitWord += word.charAt(i);
      if ((i + 1) % 7 == 0) {
        answer += asciiToChar(splitWord);
        splitWord = "";
      }
    }

    System.out.println(answer);

    return;
  }

  public static char asciiToChar(String binary) {
    String binaryWord = binary.replace("#", "1").replace("*", "0");

    int i = Integer.parseInt(binaryWord, 2);

    return (char) i;
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
