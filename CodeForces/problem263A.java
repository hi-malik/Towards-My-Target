import java.util.*;
public class problem263A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int a[][] = new int[6][6];
        int r,c;
        for(int i = 1; i < 6; i++){
            for(int j = 1; j < 6; j++){
                a[i][j] = scn.nextInt();
                if(a[i][j] == 1){
                    r = Math.abs(3 - i);
                    c = Math.abs(3 - j);
                    System.out.println(r + c);
                }
            }
        }
        // System.out.println("Print Here");
    }
}
// Problem Link :- https://codeforces.com/contest/263/problem/A