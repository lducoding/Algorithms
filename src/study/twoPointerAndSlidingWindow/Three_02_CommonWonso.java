package study.twoPointerAndSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Three_02_CommonWonso {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int arr1Size = in.nextInt();
    int[] arr1 = new int[arr1Size];
    for (int i = 0; i < arr1Size; i++) {
      arr1[i] = in.nextInt();
    }
    int arr2Size = in.nextInt();
    int[] arr2 = new int[arr2Size];
    for (int i = 0; i < arr2Size; i++) {
      arr2[i] = in.nextInt();
    }

    Three_02_CommonWonso three_01_twoArrayMerge = new Three_02_CommonWonso();
    List<Integer> solution = three_01_twoArrayMerge.solution(arr1Size, arr1, arr2Size, arr2);
    for (int num : solution) {
      System.out.print(num+" ");
    }
  }

  public List<Integer> solution(int arr1Size, int[] arr1, int arr2Size, int[] arr2) {
    List<Integer> answerList = new ArrayList<>();

    Arrays.sort(arr1);
    Arrays.sort(arr2);
    int point1 =0;
    int point2 =0;
    while (point1 < arr1Size && point2 < arr2Size) {
      if(arr1[point1] == arr2[point2]) {
        answerList.add(arr1[point1]);
        point1++;
      } else if(arr1[point1] < arr2[point2]) {
        point1++;
      } else if(arr2[point2] < arr1[point1]) {
        point2++;
      }
    }

    return answerList;
  }
}
