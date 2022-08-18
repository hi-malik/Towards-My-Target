import java.util.*;
public class problem791A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int a = scn.nextInt();
        int b = scn.nextInt();

        // if(a == b) System.out.println(a);
        int count = 0;
        
        while(a <= b){
            a *= 3;
            // System.out.println(a);
            b *= 2;
            // System.out.println(b);
            count++;
        }
        if(a > b) System.out.println(count);
        
        // System.out.println("Print Here");
    }
}
// Problem link :- https://codeforces.com/problemset/problem/791/A