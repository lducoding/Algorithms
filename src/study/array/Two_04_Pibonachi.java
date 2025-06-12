package study.array;

import java.util.Scanner;

public class Two_04_Pibonachi {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int startNum = 2;
    int count = 0;
    while (startNum <= num) {
      if (isSosu(startNum)) {
        count++;
      }

      startNum++;
    }

    System.out.println(count);
    return;
  }

  public static boolean isSosu(int number) {
    boolean flag = true;

    if (number == 2) {
      flag = true;
    }

    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return flag;
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
