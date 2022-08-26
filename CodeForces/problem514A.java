import java.util.*;
public class problem514A{
    public static void main(String[] args){
        // Solution - 1
        /* 
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String ans = new String();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(0) == '9' && i == 0) ans += s.charAt(0);
            else{
                int a = s.charAt(i) - '0';
                int b = 9 - a;
                ans += Math.min(a, b);
            }
        }
        System.out.println(ans);
        */
        // Solution - 2
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong(), ans = 0, t = 1;

        while(n > 0){
            if(n == 9){
                ans += 9 * t;
            }
            long temp = n % 10;
            ans += Math.min(temp, 9 - temp) * t;
            t *= 10;
            n /= 10;
        }
        System.out.println(ans);
    }
}
// Problem Link :- https://codeforces.com/contest/514/problem/A