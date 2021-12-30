package Stack_Queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class TruckOnBridge {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weight = {7,4,5,6};
        System.out.println(solution(bridge_length,weight,truck_weight));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();

        Arrays.sort(truck_weights);

        int size = truck_weights.length-1;

        for (int i = size; i >= 0; i--) {
            queue.offer(truck_weights[i]);
        }
        System.out.println(queue.poll());

        return answer;
    }
}
