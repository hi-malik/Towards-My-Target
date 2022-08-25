import java.util.*;
public class problem469A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();

        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int a = ch - '0';
            set.add(a);
        }
        for(int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            int a = ch - '0';
            set.add(a);
        }
        for(int i = 1; i < n; i++){
            if(!set.contains(i)){
                System.out.println("Oh, my keyboard!"); 
                return;
            }
        }
        System.out.println("I become the guy.");
        // if(set.contains(n) || set2.contains(n)) System.out.println("I become the guy.");
        // else System.out.println("Oh, my keyboard!"); 

        // System.out.println("Print Here");
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/469/A