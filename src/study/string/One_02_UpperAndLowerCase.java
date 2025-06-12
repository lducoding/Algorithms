package study.string;

import java.util.Scanner;

public class One_02_UpperAndLowerCase {

  // 6분 31초
//  public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    String str = in.next();
//
//    StringBuilder returnStr = new StringBuilder();
//    for (char c : str.toCharArray()) {
//
//      if (Character.isLowerCase(c)) {
//        returnStr.append(Character.toUpperCase(c));
//      }
//      if (Character.isUpperCase(c)) {
//        returnStr.append(Character.toLowerCase(c));
//      }
//
//    }
//
//    System.out.println(returnStr);
//  }
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.next();

    String returnStr = "";
    for (char c : str.toCharArray()) {

      if (Character.isLowerCase(c)) {
        returnStr += Character.toUpperCase(c);
      } else {
        returnStr += Character.toLowerCase(c);
      }

    }

    System.out.println(returnStr);
  }
}
