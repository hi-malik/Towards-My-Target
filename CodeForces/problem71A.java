import java.util.*;
public class problem71A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n--> 0){
            String str = scn.next();
            if(str.length() > 10){
                char ch1 = str.charAt(0);
                char ch2 = str.charAt(str.length() - 1);
                int count = 0;
                for(int i = 1; i < str.length() - 1; i++){
                    count++;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(ch1);
                sb.append(count);
                sb.append(ch2);
                System.out.println(sb.toString());
            }
            else{
                System.out.println(str);
            }
        }
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/71/A