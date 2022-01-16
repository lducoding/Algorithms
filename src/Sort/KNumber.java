package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KNumber {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution(array,commands)));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int count = 0;
        while(count < commands.length) {
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> sortList = new ArrayList<>();
            for (int i = 0; i < commands[count].length; i++) {
                list.add(commands[count][i]);
            }
            for (int i = list.get(0)-1; i < list.get(1); i++) {
                sortList.add(array[i]);
            }
            Collections.sort(sortList);
            answer[count] = sortList.get(list.get(2)-1);
            count++;
        }
        return answer;
    }
}
