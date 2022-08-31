import java.util.*;
public class problem219A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String s = scn.next();
        int Farr[] = new int[26];

        for(int i = 0; i < s.length(); i++){
            Farr[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(Farr[i] % n != 0) {
                System.out.println("-1");
                return;
            }
        }
        
        String str = "";

        for(int i = 0; i < 26; i++){
            for(int j = 0; j < Farr[i] / n; j++){
                str += (char) (i + 97);
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(str);
        }
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/219/A