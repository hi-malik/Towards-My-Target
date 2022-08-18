import java.util.*;
public class Codeforces815levelA{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while(n --> 0){
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
            int d = scn.nextInt();
            int count = 0;
            if(a != c && b == d){
                if(a > c){
                    a = a*c;
                    count++;
                }
                else{
                    c = c*a;
                    count++;
                }
                System.out.println(count);
            }
            if(a == c && b != d){
                if(b > d){
                    b = b*d;
                    count++;
                }
                else{
                    d = d*b;
                    count++;
                }
                System.out.println(count);
            }
            while(a != c && b != d){
                int help;
                if(a > c){
                    
                    if(a % c == 0){
                        help = a/c;
                    }
                    else{
                        help = a/c + 1;
                    }
                }
                if(b > d){
                    if(b % d == 0){
                        help = help * b/d;
                    }
                    else{
                        help = b/d + 1;
                    }
                }
            }
        }
        // System.out.println("Print Here");
    }
}
// Unable to solve this problem.