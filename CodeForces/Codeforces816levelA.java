import java.util.*;
public class Codeforces816levelA{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int t = scn.nextInt();
        while(t --> 0){
            // String p = scn.nextLine();
            // String q[] = p.split(" ");
            // int n = Integer.parseInt(q[0]);
            // int m = Integer.parseInt(q[1]);

            int n = scn.nextInt();
            int m = scn.nextInt();
            if(n == 1 && m == 1){
                System.out.println(0);
                return;
            }
            int sum = n + m - 2;
            sum += Math.min(n, m);
            System.out.println(sum);
        }
        
        
        // System.out.println("Print Here");
    }
}
// Unable to solve
// Problem Link :- https://codeforces.com/contest/1715/problem/0