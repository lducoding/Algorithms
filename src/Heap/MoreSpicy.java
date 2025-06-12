package Heap;


import java.util.Arrays;
import java.util.PriorityQueue;

public class MoreSpicy {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        System.out.println(solution(scoville,k));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap =  new PriorityQueue<>();

        for(int scov : scoville) {
            heap.offer(scov);
        }
        while(heap.peek() < K) {
            if(heap.size() ==1) {
                return -1;
            }
            int min = heap.poll();
            int min2 = heap.poll();

            heap.offer(min + ( min2 *2 ));
            answer++;
        }
        return answer;
    }
}
