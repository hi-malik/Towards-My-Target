import java.util.*;
public class problem59A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        String s = scn.next();
        int Uc = 0;
        int Lc = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)) Uc++;
            else Lc++;
        }
        if(Uc == Lc) System.out.println(s.toLowerCase());
        if(Uc > Lc) System.out.println(s.toUpperCase());
        if(Uc < Lc) System.out.println(s.toLowerCase()); 
        // System.out.println("Print Here");
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/59/A