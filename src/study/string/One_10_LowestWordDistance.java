package study.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class One_10_LowestWordDistance {

  public static void mainMy(String[] args) {
    Scanner in = new Scanner(System.in);
    String word = in.nextLine();

    String splitWord = word.substring(0, word.length() - 2);

    char lastChar = word.charAt(word.length() - 1);

    List<Integer> indexList = new ArrayList<>();

    for (int i = 0; i < splitWord.length(); i++) {
      if (splitWord.charAt(i) == lastChar) {
        indexList.add(i);
      }
    }

    String answer = "";

    for (int i = 0; i < splitWord.length(); i++) {
      int distance = Integer.MAX_VALUE;
      for (Integer index : indexList) {
        if (Math.abs(index - i) <= distance) {
          distance = Math.abs(index - i);
        }
      }
      answer += distance + " ";
    }

    System.out.println(answer.substring(0, answer.length() - 1));

    return;
  }

  public int[] solution(String str, char t) {
    int[] answer = new int[str.length()];

    int distance = 1000;
    for (int i = 0; i < str.length(); i++) {
      if(str.charAt(i)==t) {
        distance = 0;
        answer[i] = distance;
      } else {
        distance++;
        answer[i] = distance;
      }
    }

    for (int i = str.length()-1; i >= 0; i--) {
      if(str.charAt(i)==t) distance = 0;
      else {
        distance++;
        answer[i] = Math.min(answer[i], distance);
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    One_10_LowestWordDistance T = new One_10_LowestWordDistance();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    char t = kb.next().charAt(0);

    for (int x : T.solution(str, t)) {
      System.out.print(x + " ");
    }
  }
}
