import java.util.*;
public class problem151A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int k = scn.nextInt();
        int l = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();
        int nl = scn.nextInt();
        int np = scn.nextInt();
        int p = scn.nextInt();

        int overAllFriend = k * l;
        int noOfToast = overAllFriend / np;
        int limestoneEnoughforToatsa = c * d;
        int saltIsEnough = nl / p;
        int min = Math.min(noOfToast, Math.min(limestoneEnoughforToatsa, saltIsEnough)) / n;
        System.out.println(min);
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/151/A