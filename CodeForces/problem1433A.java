import java.util.*;
public class problem1433A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while(n --> 0){
            String s = scn.next();
            int dig = s.charAt(0) - '0' - 1;
            int len = s.length();

            System.out.println(10 * dig + len*(len + 1) / 2);    
        }
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/1433/A