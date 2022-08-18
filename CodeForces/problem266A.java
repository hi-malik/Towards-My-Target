import java.util.*;
public class problem266A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        String s = scn.next();
        int count = 0;
        for(int i = 1; i < s.length(); i++){
            
            if(s.charAt(i) == s.charAt(i - 1)){
                count++;
            }
        }
        System.out.println(count);
        // System.out.println("Print Here");
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/266/A