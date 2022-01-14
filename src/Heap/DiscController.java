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
        time += jobs[0][1];
        answer = time - jobs[0][0];
        for (int i = 1; i < jobs.length; i++) {
            heap.add(jobs[i]);
        }
        while (true) {
            if(time >= heap.peek()[0]) {
                System.out.println("실행:"+heap.peek()[1]);
                int temp = heap.peek()[0];
                time += heap.poll()[1];
                answer += time - temp;
                if(heap.size()==0) {
                    break;
                }
            }
        }
        return answer/ jobs.length;
    }
}
