package study.array;

import java.util.Scanner;

public class Two_03_RockScissorPaper {

//  public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    int length = in.nextInt();
//    int[] a = new int[length];
//    int[] b = new int[length];
//    for (int i = 0; i < length; i++) {
//      a[i] = in.nextInt();
//    }
//    for (int i = 0; i < length; i++) {
//      b[i] = in.nextInt();
//      switch (a[i] - b[i]) {
//        case 0: {
//          System.out.println("D");
//          break;
//        }
//        case 1: {
//          System.out.println("A");
//          break;
//        }
//        case -2: {
//          System.out.println("A");
//          break;
//        }
//        case 2: {
//          System.out.println("B");
//          break;
//        }
//        case -1: {
//          System.out.println("B");
//          break;
//        }
//      }
//    }
//
//    return;
//  }


  public String solution(int n, int[] a, int[] b) {
    String answer = "";
    for (int i = 0; i < n; i++) {
      if(a[i]==b[i]) answer += "D";
      else if (a[i]==1 && b[i]==3) answer += "A";
      else if (a[i]==2 && b[i]==1) answer += "A";
      else if (a[i]==3 && b[i]==2) answer += "A";
      else answer += "B";
    }
    return answer;
  }

  public static void main(String[] args) {
    Two_03_RockScissorPaper T = new Two_03_RockScissorPaper();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = kb.nextInt();
    }
    for (int i = 0; i < n; i++) {
      b[i] = kb.nextInt();
    }
    for (char x : T.solution(n, a, b).toCharArray()) {
      System.out.println(x);
    }
  }
}
