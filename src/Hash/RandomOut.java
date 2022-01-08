package Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomOut {
    // 배열이 주어지면 그 배열을 랜덤으로 반환하지만 모든게 나올때까지 중복이 되어 반환되면 안됨
    public static void main(String[] args) {
        String[] input = {"a","b","c"};
        solution(input);
    }

    public static void solution(String[] input) {
        Map<Integer,Integer> numChk = new HashMap<>();
        int chk = 0;
        while((numChk.size() != input.length) && (chk != input.length)) {
            Random random =  new Random();
            int num = random.nextInt(input.length);

            if ((numChk.getOrDefault(num, 100)) == 100) {
                System.out.println(input[num]);
                numChk.put(num, 0);
                chk++;
            }
        }

    }

}
