package Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class PhoneNumList {
    public static void main(String[] args) {
        String[] list = {"123","12","1","44"};
        System.out.println( list[1].substring(0,2) );
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String,Integer> hmap = new HashMap<String,Integer>();
        for (int i = 0; i < phone_book.length; i++) {
            hmap.put(phone_book[i],i);
        }
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book[i].length(); j++) {
                if( hmap.containsKey(phone_book[i].substring(0,j)) ) {
                    return false;
                }
            }
        }
        return answer;

    }
    public static boolean solution2(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = i+1; j < phone_book.length; j++) {
                if(phone_book[j].startsWith(phone_book[i])) {
                    return false;
                }
            }
        }
        return answer;
    }
}
