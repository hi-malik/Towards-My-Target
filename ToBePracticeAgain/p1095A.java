import java.util.*;
public class p1095A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String s = scn.next();
        int i = 2, j = 0;
        while(j <= n - 1){
            System.out.print(s.charAt(j));
            j += i;
            i++;
        }
    }
}
// Problem Link :- 