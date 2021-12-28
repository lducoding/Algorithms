package Stack_Queue;

import java.util.ArrayList;
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
        ArrayList<Integer> prioList = new ArrayList<>();
        ArrayList<Integer> orderList = new ArrayList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(priorities[i]);
        }
        while (!queue.isEmpty()) {
            int qNum = queue.poll();
            int check = 0;
            for (int i = 0; i < priorities.length; i++) {
                if(qNum < priorities[i] && priorities[i] != 0) {
                    queue.offer(priorities[i]);
                    check++;
                }
            }
            if(check == 0) {

                System.out.println(qNum);
            }
        }
        System.out.println(prioList);
        System.out.println(orderList);

        return answer;
    }
}
