import java.util.*;
public class problem546A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int k = scn.nextInt();
        int n = scn.nextInt();
        int w = scn.nextInt();

        int sum = k;
        for(int i = 2; i <= w; i++){
            sum += k * i;
        }
        
        if(sum <= n) {
            System.out.println(0);
            return;
        }
        System.out.println(sum - n);
        // System.out.println("Print Here");
    }
}
