import java.util.*;
public class problem144A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int maxi = 0, mini = 0;
        int max_v = 0, min_v = 110;

        for(int i = 0; i < n; i++){
            int a = scn.nextInt();
            if(a > max_v){
                maxi = i;
                max_v = a;
            }
            if(a <= min_v){
                mini = i;
                min_v = a;
            }
        }
        if(maxi > mini) System.out.println((maxi - 1) + (n - mini) - 1);
        else System.out.println((maxi - 1) + (n - mini));
        
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/144/A