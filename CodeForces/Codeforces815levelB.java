import java.util.*;
public class Codeforces815levelB{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        while(n --> 0){
            int m = scn.nextInt();
            int arr[] = new int[m];
            for(int i = 0; i < m; i++){
                arr[i] = scn.nextInt();
            }
            Arrays.sort(arr);

            int max = arr[arr.length - 1] - 1;
            
            int min = arr[arr.length - 2] - 1;

            if(max == min) System.out.println(0);
            else System.out.println(max + min);
        }

        // System.out.println("Print Here");
    }
}
// Unable to solve this problem.