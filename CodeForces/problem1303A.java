import java.util.*;
public class problem1303A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while(n --> 0){
            int count = 0;
            String s = scn.next();

            for(int i = s.indexOf('1'); i < s.lastIndexOf('1'); i++){
                if(s.charAt(i) == '0') count++;
            }
            System.out.println(count);
        }
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/1303/A