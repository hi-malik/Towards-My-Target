import java.util.*;
public class problem139A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[7];
        for(int i = 0; i < 7; i++) arr[i] = scn.nextInt();
        int sum = 0;
        for(;;)
        for(int i = 0; i < 7; i++){
            sum += arr[i];
            if(sum >= n) {
                System.out.println(i + 1);
                return;
            }
        }
    //     Scanner sc = new Scanner(System.in);
    //  int n=sc.nextInt(); int sum=0;int d[] = new int[7];
    //  for(int i=0;i<7;i++)
    //  d[i]= sc.nextInt();
    //  for(;;) --------------------------------------> This is important to note!
    //  for(int j=0;j<7;j++){sum+=d[j];if(sum>=n){System.out.println(j+1);return;}}
     }
}
// Problem Link :- https://codeforces.com/contest/139/problem/A