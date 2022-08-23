import java.util.*;
public class problem344A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int a[] = new int[1000000];
        for(int i = 0; i <  n; i++){
            a[i] = scn.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(a[i] != a[i + 1]) count++;
        }
        System.out.println(count);
        // System.out.println("Print Here");
    }
}
// Problem Link  :- https://codeforces.com/problemset/problem/344/A