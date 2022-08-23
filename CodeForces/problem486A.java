import java.util.*;
public class problem486A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        
        long sum = 0;
        if(n % 2 == 0) sum = n / 2;
        else sum = -1*(n / 2 + 1);

        System.out.println(sum);
        // System.out.println("Print Here");
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/486/A