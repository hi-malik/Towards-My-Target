import java.util.*;
public class problem467A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;

        while(n --> 0){
            int a[] = new int[2];
            for(int i = 0; i < 2; i++){
                a[i] = scn.nextInt();
            }
            if(a[1] - a[0] >= 2) count++;

        }
        System.out.println(count);
        // System.out.println("Print Here");
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/467/A