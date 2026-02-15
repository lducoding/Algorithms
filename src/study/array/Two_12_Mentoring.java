package study.array;

import java.util.Scanner;

public class Two_12_Mentoring {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int studentCount = in.nextInt();
    int testCount = in.nextInt();
    int[][] arr = new int[testCount][studentCount];
    for (int i = 0; i < testCount; i++) {
      for (int j = 0; j < studentCount; j++) {
        arr[i][j] = in.nextInt();
      }
    }
    Two_12_Mentoring two_12_mentoring = new Two_12_Mentoring();
    System.out.println(two_12_mentoring.solution(studentCount, testCount, arr));
  }

  public int solution(int studentCount, int testCount, int[][] arr) {
    int answer = 0;
    // 멘토
    for (int i = 1; i <= studentCount; i++) {
      // 멘티
      for (int j = 1; j <= studentCount; j++) {
        int mentorValidCount = 0;
        // 시험 갯수
        for (int k = 0; k < testCount; k++) {
          int mentorGrade = Integer.MIN_VALUE;
          int mentiGrade = Integer.MIN_VALUE;
          // 시험등수
          for (int l = 0; l < studentCount; l++) {
            if(arr[k][l] == i) {
              mentorGrade = l;
            }
            if(arr[k][l] == j) {
               mentiGrade= l;
            }
          }
          if(mentorGrade < mentiGrade) {
            mentorValidCount++;
          }
        }
        if(mentorValidCount == testCount) {
          answer++;
        }
      }
    }

    return answer;
  }
}
