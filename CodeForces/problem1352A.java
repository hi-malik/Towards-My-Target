import java.util.*;
public class problem1352A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while(n --> 0){
            int m = scn.nextInt();
            int a[] = new int[6];
            int ans = 0, t = 1;
            for(int i = 1; i < 6; i++){
                a[i] = m % 10;
                m /= 10;
                if(a[i] != 0) ans++;
            }
            System.out.println(ans);
            for(int i = 1; i < 6; i++){
                if(a[i] != 0){
                    System.out.print(a[i] * t + " ");
                }
                t *= 10;
            }
            System.out.println();
        }
        
    }
}
// Problem Link :- https://codeforces.com/contest/1352/problem/A