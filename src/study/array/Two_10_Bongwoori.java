package study.array;

import java.util.Scanner;

public class Two_10_Bongwoori {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[][] arr = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = in.nextInt();
      }
    }
    int count = 0;

    for (int i = 0; i < n; i++) {
      int west = 0;
      int east = 0;
      int south = 0;
      int north = 0;
      for (int j = 0; j < n; j++) {
        int high = arr[i][j];
        if (i != 0) {
          north = arr[i - 1][j];
        }
        if (i != n - 1) {
          south = arr[i + 1][j];
        }
        if (j != 0) {
          west = arr[i][j - 1];
        }
        if (j != n - 1) {
          east = arr[i][j + 1];
        }

        if ((high > west) && (high > east) && (high > south) && (high > north)) {
          count++;
        }
        west = 0;
        east = 0;
        south = 0;
        north = 0;
      }
    }
    System.out.println(count);
  }

  public static boolean isSosu2(int number) {
    boolean flag = true;

    if(number == 2) flag = true;
    if(number == 1) flag = false;

    for(int i = 2; i <= Math.sqrt(number); i++) {
      if(number % i == 0) flag = false;
    }

    return flag;
  }

  public static boolean isSosu(int number) {
    boolean flag = true;

    if (number == 2) flag = true;

    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) return false;
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
