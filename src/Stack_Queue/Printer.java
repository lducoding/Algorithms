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
        Queue<Integer> queue2 = new LinkedList<>();
        ArrayList<Integer> prioList = new ArrayList<>();
        ArrayList<Integer> orderList = new ArrayList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(priorities[i]);
            queue2.offer(i);
        }

        while (!queue.isEmpty()) {
            int qNum = queue.poll();
            int qOrdNum = queue2.poll();
            int check = 0;
            for (int i = 0; i < priorities.length; i++) {
                if(qNum < priorities[i] && priorities[i] != 0 && check != 1) {
                    queue.offer(qNum);
                    queue2.offer(qOrdNum);
                    check++;
                }
            }
            if(check == 0) {
                priorities[qOrdNum] = 0;
                prioList.add(qNum);
                orderList.add(qOrdNum);
            }
        }

        for (int i = 0; i < orderList.size(); i++) {
            if(location == orderList.get(i)) {
                answer = i+1;
            }
        }

        return answer;
    }
}
