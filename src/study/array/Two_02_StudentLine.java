package study.array;

import java.util.Scanner;

public class Two_02_StudentLine {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int length = in.nextInt();
    int[] numArray = new int[length];
    int count = 0;
    int target = Integer.MIN_VALUE;
    for (int i = 0; i < length; i++) {
      numArray[i] = in.nextInt();
      if (target < numArray[i]) {
        count++;
        target = numArray[i];
      }

    }

    System.out.println(count);

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
