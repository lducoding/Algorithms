package study.array;

import java.util.Scanner;

public class Two_11_ImsiBanjang {


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[][] arr = new int[n][5];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 5; j++) {
        arr[i][j] = in.nextInt();
      }
    }
    Two_11_ImsiBanjang two_11_imsiBanjang = new Two_11_ImsiBanjang();
    System.out.println(two_11_imsiBanjang.solution(n,arr));
  }

  public int solution(int n, int[][] arr) {
    int captain = 0;
    int captainCount = Integer.MIN_VALUE;

    // 비교할 대상 학생1
    for (int i = 0; i < n; i++) {
      int imsiCaptainCount = 0;
      // 비교받는대상 학생2
      for (int j = 0; j < n; j++) {
        // 학년
        for (int k = 0; k < 5; k++) {
          if (arr[i][k] == arr[j][k]) {
            imsiCaptainCount++;
            break;
          }
        }
      }
      if (imsiCaptainCount > captainCount) {
        captainCount = imsiCaptainCount;
        captain = i + 1;
      }
    }
    return captain;
  }
}
