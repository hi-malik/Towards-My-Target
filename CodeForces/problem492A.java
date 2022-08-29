import java.util.*;
public class problem492A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sum = 0, count = 0, i = 0;
        while(sum < n){
            i++;
            count+=i;
            sum+=count;
            if(sum > n) i--;
        }
        System.out.println(i);
    }
}
// Problem Link :- https://codeforces.com/contest/492/problem/A