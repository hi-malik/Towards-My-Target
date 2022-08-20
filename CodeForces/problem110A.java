import java.util.*;
public class problem110A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        String s = scn.next();
        int n= s.length();

        int count = 0;

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '7' || ch == '4') count++;
        }
        if(count == 4|| count == 7) System.out.println("YES");
        else System.out.println("NO"); 
        // System.out.println("Print Here");
    }
}
