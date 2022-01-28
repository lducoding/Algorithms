package Greedy;

public class Joystick {
    public static void main(String[] args) {
        String name = "JAN";
        System.out.println(solution(name));
        // a b c d e f g h i j k l m n o p q r s t u v w x y z
        // 1 2 3 4 5 6 7 8 9 1011121314151617181920212223242526
    }

    public static int solution(String name) {
        int answer = 0;
        int[] diff={0,1,2,3,4,5,6,7,8,9,10,11,12,13,12,11,10,9,8,7,6,5,4,3,2,1};
        for(char c:name.toCharArray())
            answer+=diff[c-'A'];

        int length=name.length();
        int min=length-1;

        for(int i=0;i<length;i++){
            int next=i+1;
            while(next<length && name.charAt(next)=='A'){
                next++;
            }
            min=Math.min(min,i+length-next+Math.min(i,length-next));
        }

        return answer+min;
    }
}
