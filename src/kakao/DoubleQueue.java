package kakao;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DoubleQueue {
    public static void main(String[] args) {
        // t1
//        int[] queue1 = {3, 2, 7, 2};
//        int[] queue2 = {4, 6, 5, 1};

        // t2
//        int[] queue1 = {1, 2, 1, 2};
//        int[] queue2 = {1, 10, 1, 2};

        // t3
//        int[] queue1 = {1, 1};
//        int[] queue2 = {1, 5};

        // t4
        int[] queue1 = {1, 1, 1, 1};
        int[] queue2 = {1, 1, 7, 1};

        int solution = solution(queue1, queue2);
        System.out.println(solution);
    }


    public static int solution(int[] queue1, int[] queue2) {
        // 총합구하기
        Long total = 0L;
        Long totalQ1 = 0L;
        Queue<Integer> q1 = new LinkedList();
        Queue<Integer> q2 = new LinkedList();
        for (int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            q2.add(queue2[i]);
            total += queue1[i];
            total += queue2[i];
            totalQ1 += queue1[i];
        }
        // 홀수인지 체크
        if (total % 2 != 0) {
            return -1;
        }
        // 큰쪽에서 빼서 작은쪽으로 더하기
        boolean flag = true;
        int count = 0;
        while (flag) {
            if (totalQ1 > (total / 2)) {
                Integer poll = q1.poll();
                q2.add(poll);
                totalQ1 -= poll;
                count += 1;
            }
            if (totalQ1 < (total / 2)) {
                Integer poll = q2.poll();
                q1.add(poll);
                totalQ1 += poll;
                count += 1;
            }
            if(totalQ1 == (total / 2)) {
                flag = false;
            }
            if (count > (queue1.length + queue2.length)*2) {
                return -1;
            }

        }

        return count;
    }
}
