import java.util.*;
public class problem118A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            // sb.append(".");
            if(str.charAt(i) != 'a' && str.charAt(i) != 'o' && str.charAt(i) != 'y' && str.charAt(i) != 'i' && str.charAt(i) != 'e' && str.charAt(i) != 'u'){
                sb.append(".");
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/118/A