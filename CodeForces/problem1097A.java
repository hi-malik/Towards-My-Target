import java.util.*;
public class problem1097A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        String s = scn.next();
        String s1 = scn.next();
        String s2 = scn.next();
        String s3 = scn.next();
        String s4 = scn.next();
        String s5 = scn.next();

        if(s1.charAt(0) == s.charAt(0) || s1.charAt(1) == s.charAt(1)) {
            System.out.println("YES");
            return;
        }
        if(s2.charAt(0) == s.charAt(0) || s2.charAt(1) == s.charAt(1)) {
            System.out.println("YES");
            return;
        }
        if(s3.charAt(0) == s.charAt(0) || s3.charAt(1) == s.charAt(1)) {
            System.out.println("YES");
            return;
        }
        if(s4.charAt(0) == s.charAt(0) || s4.charAt(1) == s.charAt(1)) {
            System.out.println("YES");
            return;
        }
        if(s5.charAt(0) == s.charAt(0) || s5.charAt(1) == s.charAt(1)) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/1097/A