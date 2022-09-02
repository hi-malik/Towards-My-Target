import java.util.*;
public class problem1373A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t --> 0){
            long a = scn.nextLong();
            long b = scn.nextLong();
            long c = scn.nextLong();
            
            if(a < c) System.out.print(1 + " ");
            else System.out.print(-1 + " ");

            if(b * a > c) System.out.print(b + " ");
            else System.out.print(-1 + " ");

            System.out.println();
        }        
    }
}
// Problem Link :- 