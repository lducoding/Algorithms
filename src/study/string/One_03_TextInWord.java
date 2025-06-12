package study.string;

import java.util.Scanner;

public class One_03_TextInWord {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String input1 = in.nextLine();

    char[] charArray = input1.toCharArray();
    String word = "";
    int wordCount = 0;
    String answerWord = "";

    for (int i = 0; i <= charArray.length - 1; i++) {
      if (charArray[i] != ' ') {
        word += charArray[i];
        wordCount++;
      }

      if (charArray[i] == ' ' || i == charArray.length - 1) {
        if (wordCount > answerWord.length()) {
          answerWord = word;
        }
        word = "";
        wordCount = 0;
      }
    }
    System.out.println(answerWord);
    return;
  }

  public static void mainClass(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();

    String[] words = str.split(" ");

    String answer = "";
    for (String word : words) {
      if(word.length() > answer.length()) {
        answer = word;
      }
    }

    System.out.println(answer);
  }
}
