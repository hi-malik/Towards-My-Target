import java.util.*;
public class p510A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        for(int i = 1; i <= n; i++){
            if(i % 4 == 2){
                for(int j = 1; j < m; j++){
                    System.out.print(".");
                }        
                System.out.print("#");
            }
            else if(i % 4 == 0){
                System.out.print("#");
                for(int j = 1; j < m; j++){
                    System.out.print(".");
                }        
            }
            else{
                for(int j = 1; j <= m; j++){
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        System.out.println("Print Here");
    }
}
// Problem Link :- 