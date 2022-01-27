package Greedy;

public class Joystick {
    public static void main(String[] args) {
        String name = "JAN";
        System.out.println(solution(name));
    }

    public static int solution(String name) {
        int answer = 0;

        for (int i = 0; i < name.length(); i++) {
            System.out.println((int)name.charAt(i)-64);
        }

        return answer;
    }
}
