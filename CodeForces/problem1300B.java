import java.util.*;
public class problem1300B{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t --> 0){
            int n = scn.nextInt();
            int arr[] = new int[2 * n];
            for(int i = 0; i < 2 * n; i++) arr[i] = scn.nextInt();
            Arrays.sort(arr);
            System.out.println(Math.abs(arr[n - 1] - arr[n]));
        }
    }
}
// Problem Link :- 