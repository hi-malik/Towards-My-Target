import java.util.*;
public class problem1430C{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t--> 0){
            int n = scn.nextInt();
            System.out.println(2);
            int a  = n, b = n - 1;
            while(n --> 1){
                System.out.println(b + " " + a);
                a = (a + b + 1) / 2;
                b = n - 1;
            }
        }
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/1430/C