import java.util.*;
public class problem1368A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t --> 0){
            int a = scn.nextInt();
            int b = scn.nextInt();
            int n = scn.nextInt();
            int count = 0;
            while(a + b <= n){
                if(a > b) b += a;
                else a += b;
                count++;
            }
            count++;
            System.out.println(count);
        }
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/1368/A