import java.util.*;
public class problem148A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int l = scn.nextInt();
        int m = scn.nextInt();
        int n = scn.nextInt();
        int d = scn.nextInt();

        int count = 0;
        for(int i = 1; i <= d; i++){
            if(i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) count++;
        }
        System.out.println(count);
        // System.out.println("Print Here");
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/148/A