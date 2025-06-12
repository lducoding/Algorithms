package study.string;

import java.util.Scanner;

public class One_05_ReverseSpecificChar {

  public static void mainMy(String[] args) {
    Scanner in = new Scanner(System.in);
    String word = in.nextLine();

    String answer = "";

    StringBuffer sb = new StringBuffer();
    String reverseWord = sb.append(word).reverse().toString();

    char[] wordCharArray = word.toCharArray();
    char[] reverseWordCharArray = reverseWord.toCharArray();

    for (int i = 0; i < wordCharArray.length; i++) {
      if (Character.isAlphabetic(wordCharArray[i])) {
        for (int j = 0; j < reverseWordCharArray.length; j++) {
          if (Character.isAlphabetic(reverseWordCharArray[j])) {
            answer += reverseWordCharArray[j];
            reverseWordCharArray[j] = '0';
            break;
          }
        }
      } else {
        answer += wordCharArray[i];
      }
    }

    System.out.println(answer);
    return;
  }

  public String solution(String str) {
    String answer = "";

    int lt = 0;
    int rt = str.length() - 1;
    char[] chars = str.toCharArray();
    while (lt < rt) {
      if (!Character.isAlphabetic(chars[lt])) {
        lt++;
      } else if (!Character.isAlphabetic(chars[rt])) {
        rt--;
      } else {
        char temp = chars[lt];
        chars[lt] = chars[rt];
        chars[rt] = temp;
        lt++;
        rt--;
      }
    }

    return String.valueOf(chars);
  }

  public static void main(String[] args) {
    One_05_ReverseSpecificChar T = new One_05_ReverseSpecificChar();
    Scanner kb = new Scanner(System.in);
    String str = kb.nextLine();

    System.out.println(T.solution(str));
  }
}
