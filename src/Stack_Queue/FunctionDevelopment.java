package Stack_Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FunctionDevelopment {
    public static void main(String[] args) {
        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};
        System.out.println( Arrays.toString( solution( progresses,speeds ) ) );
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        boolean ck = true;
        int[] finDay = new int[progresses.length];
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer>  queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int imsi = 0;
            imsi = 100 - progresses[i];
            if(imsi%speeds[i] != 0) {
                imsi = (imsi/speeds[i])+1;
            } else {
                imsi /= speeds[i];
            }
            finDay[i] = imsi;
        }

        while (ck) {
            int preNum = -1;
            for (int i = 0; i < finDay.length; i++) {
                if(finDay[i] != 300) {
                    if(preNum < finDay[i]) {
                        if(!queue.isEmpty()) {
                            list.add(queue.size());
                            queue.clear();
                        }
                        preNum = finDay[i];
                    }
                    finDay[i] = 300;
                    queue.add(finDay[i]);
                }
            }
            if(finDay[finDay.length-1] == 300) {
                ck = false;
                list.add(queue.size());
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
