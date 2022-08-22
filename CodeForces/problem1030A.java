import java.util.*;
public class problem1030A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = scn.nextInt();

        for(int i : a){
            if(i == 1){
                System.out.println("HARD");
                return;     
            }
        }
        System.out.println("EASY");
        // System.out.println("Print Here");
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/1030/A