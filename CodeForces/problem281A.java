import java.util.*;
public class problem281A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        // if(s.length() == 0) System.out.println("");
        String res = s.substring(0, 1).toUpperCase() + s.substring(1);
        System.out.println(res);
        // System.out.println("Print Here");
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/281/A