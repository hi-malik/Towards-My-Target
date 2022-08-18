import java.util.*;
public class problem236A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            set.add(s.charAt(i));
        }
        if(set.size() % 2 == 0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
        // System.out.println("Print Here");
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/236/A