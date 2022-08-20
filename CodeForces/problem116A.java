import java.util.*;
public class problem116A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int max = 0;
        int sum = 0;
        while(n --> 0){
            int a = scn.nextInt();
            int b = scn.nextInt();
            int count = 0;
            sum += b;
            count = sum - a;
            sum = count;
            max = Math.max(max, sum);
        }
        System.out.println(max);
        // System.out.println("Print Here");
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/116/A