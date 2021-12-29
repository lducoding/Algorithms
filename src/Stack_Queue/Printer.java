package Stack_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        System.out.println(solution(priorities,location));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(priorities[i]);
        }

        Arrays.sort(priorities);

        int size = priorities.length-1;

        while (!queue.isEmpty()) {
            int qNum = queue.poll();
            if(qNum == priorities[size-answer]) {
                answer++;
                location--;
                if(location < 0) {
                    break;
                }
            } else {
                queue.add(qNum);
                location--;
                if(location < 0) {
                    location = queue.size()-1;
                }
            }
        }

        return answer;
    }
}
