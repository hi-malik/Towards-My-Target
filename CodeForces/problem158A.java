import java.util.*;
public class problem158A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int k = scn.nextInt();
        int a[] = new int[n + 1];

        for(int i = 0; i < n; i++){
            a[i] = scn.nextInt();
        }

        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] >= a[k - 1] && a[i] != 0) count++;
        }
        System.out.println(count);
        // System.out.println("Print Here");
    }
}
// Problem link :- https://codeforces.com/contest/158/problem/A