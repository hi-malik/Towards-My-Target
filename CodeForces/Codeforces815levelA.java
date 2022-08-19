import java.util.*;
public class Codeforces815levelA{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while(n --> 0){
            long a = scn.nextInt();
            long b = scn.nextInt();
            long c = scn.nextInt();
            long d = scn.nextInt();
            
            long temp1 = a * d;
            long temp2 = b * c;
            if(temp1 == temp2) System.out.println(0);
            else if(temp1 == 0 || temp2 == 0) System.out.println(1);
            else if(temp1 % temp2 == 0 || temp2 % temp1 == 0) System.out.println(1);
            else System.out.println(2);

        }
        // System.out.println("Print Here");
    }
}
// Unable to solve this problem. previously
// Problem Link :- https://codeforces.com/contest/1720/problem/A