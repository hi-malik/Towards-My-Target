import java.util.*;
public class problem677A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int h = scn.nextInt();
        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = scn.nextInt();
        }

        int count = 0;

        for(int i : a){
            if(i <= h) count++;
            
            else if(i > h) count += 2;
            
        }
        System.out.println(count);
        // System.out.println("Print Here");
    }
}
// Problem link :- https://codeforces.com/problemset/problem/677/A