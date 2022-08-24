import java.util.*;
public class problem705A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 0; i < n; i++){
            if(i % 2 == 0) System.out.print("I hate ");
            else System.out.print("I love ");
            if(i != n - 1) System.out.print("that ");
            else System.out.print("it ");
        }
        // System.out.println("Print Here");
    }
}
