import java.util.*;
public class problem977A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int k = scn.nextInt();

        while(k --> 0){
            if(n % 10 == 0) n = n / 10;
            else n--;
        }
        System.out.println(n);
        // System.out.println("Print Here");
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/977/A