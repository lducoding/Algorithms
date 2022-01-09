package Stack_Queue;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

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
        int max = 0;

        for (int i = 0; i < truck_weights.length; i++) {
            while (true) {
                if(queue.isEmpty()) {
                    queue.offer(truck_weights[i]);
                    max += truck_weights[i];
                    answer++;
                    break;
                } else if(queue.size() == bridge_length) {
                    max -= queue.poll();
                } else {
                    if(max + truck_weights[i] > weight) {
                            queue.offer(0);
                            answer++;
                    } else {
                        queue.offer(truck_weights[i]);
                        max += truck_weights[i];
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer + bridge_length;
    }
}