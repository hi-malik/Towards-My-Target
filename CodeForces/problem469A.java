import java.util.*;
public class problem469A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        int p = scn.nextInt();
        int a1[] = new int[p];
        int i = 0, k = 0;
        while(p --> 0){
            a1[i++] = scn.nextInt();
        }
        int q = scn.nextInt();
        int a2[] = new int[q];
        while(q --> 0){
            a2[k++] = scn.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for(int s : a1) set.add(s);
        for(int s : a2) set.add(s);

        
            if(set.size() != n){
                System.out.println("Oh, my keyboard!");
            }
        else 
            System.out.println("I become the guy.");

        // System.out.println("Print Here");
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/469/A