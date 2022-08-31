import java.util.*;
public class problem1141A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        
        if(n == m) {
            System.out.println(0);
            return;
        }

        int count = 0;
        while(n < m){
            if(m % (2 * n) == 0) {
                n *= 2;
                count++;}
            else if(m % (3 * n) == 0) {
                n *= 3;
                count++;}
            else {
                System.out.println(-1);
                return;
            }
            // count++; 
        }
        System.out.println(count);
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/1141/A