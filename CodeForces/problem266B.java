import java.util.*;
public class problem266B{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String p = scn.nextLine();
        String q[] = p.split(" ");
        int n = Integer.parseInt(q[0]);
        int t = Integer.parseInt(q[1]);
        String s = scn.next();
        int size = s.length();
        for(int i = 0; i < t; i++){
            for(int j = 0; j < size - 1; j++){
                if(s.charAt(j) == 'B' && s.charAt(j + 1) == 'G'){
                    char ch[] = s.toCharArray();
                    ch[j] = 'G';
                    ch[j + 1] = 'B';
                    s = String.valueOf(ch);
                    j++;
                }
            }
        }
        System.out.println(s);
        // System.out.println("Print Here");
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/266/B