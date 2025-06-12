package study.string;

import java.util.Scanner;

public class One_01_FindString {

  public static void solution(String words, String word) {

  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.next().toLowerCase();
    char character = in.next().toLowerCase().charAt(0);

    int count = 0;

    for (char c1 : str.toCharArray()) {
      if(c1 == character) count ++;
    }

    System.out.println(count);
  }
}
