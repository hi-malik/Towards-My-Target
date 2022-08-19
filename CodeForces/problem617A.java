import java.util.*;
public class problem617A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        int sum = n / 5;
        if(n % 5 == 0) System.out.println(sum);
        else System.out.println(sum + 1);
        // System.out.println("Print Here");
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/617/A