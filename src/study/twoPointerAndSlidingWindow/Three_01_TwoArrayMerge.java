package study.twoPointerAndSlidingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Three_01_TwoArrayMerge {

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

    Three_01_TwoArrayMerge three_01_twoArrayMerge = new Three_01_TwoArrayMerge();
    for (int num : three_01_twoArrayMerge.solution(arr1Size, arr1, arr2Size, arr2)) {
      System.out.print(num+" ");
    }
  }

  public List<Integer> solution(int arr1Size, int[] arr1, int arr2Size, int[] arr2) {
    List<Integer> answerList = new ArrayList<>();

    int pointer1 = 0;
    int pointer2 = 0;
    // two pointer로 하나씩 insert
    while (pointer1 < arr1Size && pointer2 < arr2Size) {
      if(arr1[pointer1] < arr2[pointer2]) {
        answerList.add(arr1[pointer1]);
        pointer1++;
      } else {
        answerList.add(arr2[pointer2]);
        pointer2++;
      }
    }
    // 둘중에 남은거 insert
    while (pointer1 < arr1Size) {
      answerList.add(arr1[pointer1]);
      pointer1++;
    }
    while (pointer2 < arr2Size) {
      answerList.add(arr2[pointer2]);
      pointer2++;
    }

    return answerList;
  }
}
