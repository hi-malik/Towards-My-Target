import java.util.*;
public class problem231A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        
        while(n --> 0){
            int sum = 0; 
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
            sum = a + b + c;
            if(sum >= 2) count++;
        }
        System.out.println(count);
        // System.out.println("Print Here");
    }
}
