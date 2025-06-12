package study.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class One_04_ReverseWord {

//  public ArrayList<String> solution(int n, String[] str){
//    ArrayList<String> answer=new ArrayList<>();
//    for(String x : str){
//      String tmp=new StringBuilder(x).reverse().toString();
//      answer.add(tmp);
//    }
//    return answer;
//  }
//
//  public static void main(String[] args){
//    Main T = new Main();
//    Scanner kb = new Scanner(System.in);
//    int n=kb.nextInt();
//    String[] str=new String[n];
//    for(int i=0; i<n; i++){
//      str[i]=kb.next();
//    }
//    for(String x : T.solution(n, str)){
//      System.out.println(x);
//    }
//  }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    List<String> inputs = new ArrayList<>();
    List<String> returns = new ArrayList<>();

    int count = Integer.parseInt(in.nextLine());

    for (int i = 0; i < count; i++) {
      String word = in.nextLine();
      inputs.add(word);
    }

    inputs.stream().forEach(s -> {
      StringBuffer sb = new StringBuffer();
      sb.append(s);
      sb.reverse();
      returns.add(sb.toString());
    });


    returns.stream().forEach(s -> System.out.println(s));
    return;
  }

    public ArrayList<String> solution(int n, String[] str){
    ArrayList<String> answer=new ArrayList<>();
    for (String s : str) {
      String reverseStr = new StringBuilder(s).reverse().toString();
      answer.add(reverseStr);
    }
    return answer;
  }
}
