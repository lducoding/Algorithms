package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class DiscController {
    public static void main(String[] args) {
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        System.out.println(solution(jobs));
    }

    public static int solution(int[][] jobs) {
        int answer = 0;
        int time = 0;
        // 시간 순서로 정렬
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        // 작업 순서로 담음
        PriorityQueue<int[]> heap = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        int count = 0;
        int index = 0;
        time = jobs[0][0];
        while(count<jobs.length){
            while(index<jobs.length && time >= jobs[index][0]){
                heap.offer(jobs[index++]);
            }
            if(!heap.isEmpty()) {
                int[] current = heap.poll();
                time+=current[1];
                answer+=time-current[0];
                count++;
            } else {
                time = jobs[index][0];
            }
        }
        return answer/jobs.length;

    }
}
