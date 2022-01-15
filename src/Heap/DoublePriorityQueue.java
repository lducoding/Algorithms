package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DoublePriorityQueue {

    public static void main(String[] args) {
        String[] operations = {"I 16","D 1"};
        //String[] operations = {"I 7","I 5","I -5","D -1"};
        System.out.println(solution(operations));
    }
    public static int[] solution(String[] operations) {
        PriorityQueue<Integer> heapMin =  new PriorityQueue<>();
        PriorityQueue<Integer> heapMax =  new PriorityQueue<>(Comparator.reverseOrder());
        int index = 0;
        while(index < operations.length){
            String chk = operations[index].replace(" ","").substring(0,1);
            if(chk.equals("I")) {
                String op = operations[index].replace(" ","").substring(1);
                heapMin.add(Integer.parseInt(op));
                heapMax.add(Integer.parseInt(op));
                index++;
            } else if(operations[index].replace(" ","").substring(0,2).equals("D-")) {
                if (!heapMin.isEmpty()) {
                    int min = heapMin.peek();
                    heapMax.remove(min);
                    heapMin.remove(min);
                }
                index++;
            } else {
                if (!heapMax.isEmpty()) {
                    int max = heapMax.peek();
                    heapMax.remove(max);
                    heapMin.remove(max);
                }
                index++;
            }
        }
        int[] answer;
        if(heapMax.isEmpty()&&heapMin.isEmpty()) {
            answer = new int[]{0, 0};
        } else {
            answer = new int[]{heapMax.peek(), heapMin.peek()};
        }
        return answer;
    }
}
