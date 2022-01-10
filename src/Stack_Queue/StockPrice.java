package Stack_Queue;

import java.util.Arrays;
import java.util.Stack;

public class StockPrice {
    public static void main(String[] args) {
        int[] prices = {1,2,3,2,3};
        System.out.println(Arrays.toString(solution(prices)));
        // 결과 4 3 1 1 0
    }

    public static int[] solution(int[] prices) {
        int[] ansIndex = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                ansIndex[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        for (int i = 0; i < ansIndex.length; i++) {
            if(ansIndex[i] == 0) {
                ansIndex[i] = (ansIndex.length - i) -1;
            }
        }

        return ansIndex;
    }
}
