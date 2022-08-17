import java.util.*;
public class problem112A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        String s1 = scn.next();
        String sl1 = s1.toLowerCase();
        String s2 = scn.next();
        String sl2 = s2.toLowerCase();

        // int sum1 = 0;
        // for(int i = 0; i < sl1.length(); i++){
        //     char ch = sl1.charAt(i);
        //     int ascii = (int)ch;
        //     sum1 += ascii;
        // }
        // int sum2 = 0;
        // for(int i = 0; i < sl2.length(); i++){
        //     char ch = sl2.charAt(i);
        //     int ascii = (int)ch;
        //     sum2 += ascii;
        // }

        if(sl1.compareTo(sl2) == 0) System.out.println(0);
        if(sl1.compareTo(sl2) > 0) System.out.println(1);
        if(sl1.compareTo(sl2) < 0) System.out.println(-1);
        // System.out.println("Print Here");
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/112/A