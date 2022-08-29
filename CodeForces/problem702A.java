import java.util.*;
public class problem702A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n + 1];

        for(int i = 0; i < n; i++) arr[i] = scn.nextInt();

        int count = 1;
        int max = 1;
        for(int i = 0; i < n; i++){
            if(arr[i] < arr[i + 1]) {
                count++;
                max = Math.max(max, count);
            }
            else if(arr[i] >= arr[i + 1]) count = 1;
        }
        System.out.println(max);
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/702/A