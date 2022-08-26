import java.util.*;
public class problem723A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a[] = new int[3];
        for(int i = 0; i < 3; i++){
            a[i] = scn.nextInt();
        }
        Arrays.sort(a);
        int res = (a[1] - a[0]) + (a[2] - a[1]);
        System.out.println(res);
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/723/A