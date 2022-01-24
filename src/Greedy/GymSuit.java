package Greedy;

import java.util.LinkedList;
import java.util.Queue;

public class GymSuit {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {3,4};
        int[] reserve = {1,3,5};
        System.out.println(solution(n,lost,reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        n -= lost.length;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < reserve.length; i++) {
            queue.add(reserve[i]);
        }

        for (int i = 0; i < lost.length; i++) {
            if(!queue.isEmpty()) {
                int num = queue.peek();
                if(lost[i]-1 == num || lost[i]+1 == num) {
                    queue.poll();
                    n++;
                }
            }
        }

        return n;
    }
}
