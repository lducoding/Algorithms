package Heap;

import sun.lwawt.macosx.CSystemTray;

import java.util.Arrays;

public class MoreSpicy {
    public static void main(String[] args) {
        int[] scoville = {13,3,2,9,10,12};
        int k = 7;
        System.out.println(solution(scoville,k));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;

        for (int i = 1; i < scoville.length; i++) {
            int root = 0;
            int c = i;
            int node1 = 0;
            while (c!=0) {
                root = (c-1) / 2;
                node1 = 2 * root + 1;
                if(scoville[root] > scoville[i]) {
                    int temp = scoville[root];
                    scoville[root] = scoville[i];
                    scoville[i] = temp;
                }
                if(node1 < scoville.length-1) {
                    if(scoville[node1] > scoville[node1+1]) {
                        int temp = scoville[node1];
                        scoville[node1] = scoville[node1+1];
                        scoville[node1+1] = temp;
                    }
                }
                c = root;
            }

        }
        System.out.println("1차:"+Arrays.toString(scoville));

        return answer;
    }
}
