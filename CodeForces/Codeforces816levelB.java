import java.util.*;
public class Codeforces816levelB{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int t = scn.nextInt();
        
        while(t --> 0){
            long n = scn.nextLong();
            long k = scn.nextLong();
            long b = scn.nextLong();
            long s = scn.nextLong();

            if(s < k * b || s > n * (k - 1) + k * b) {
                System.out.println(-1);
                return;
            }
            else{
                long a[] = new long[(int) n];
                a[0] = k * b;
                s -= k * b;
                for(int i = 0; i < n && s > 0; i++){
                    a[i] += Math.min(k - 1, s);
                    s -= Math.min(k - 1, s);
                }
                for(int i = 0; i < a.length; i++){
                    System.out.println(a[i] + " ");
                }
            } 
        }
        // System.out.println("Print Here");
    }
}
// Unable to solve
// Problem Link :- https://codeforces.com/contest/1715/problem/B