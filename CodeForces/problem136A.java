import java.util.*;
public class problem136A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int a[] = new int[n + 1];

        for(int i = 1; i <= n; i++){
            int k = scn.nextInt();
            a[k] = i;
        }
        for(int i = 1; i <= n; i++){
            System.out.print(a[i] + " ");
        }
        
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/136/A