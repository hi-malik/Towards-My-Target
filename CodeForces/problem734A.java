import java.util.*;
public class problem734A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        String s = scn.next();
        
        int Anton = 0;
        int Danik = 0;

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'A') Anton++;
            else Danik++;
        }
        if(Anton > Danik) System.out.println("Anton");
        else if(Anton < Danik) System.out.println("Danik");
        else System.out.println("Friendship"); 
        // System.out.println("Print Here");
    }
}
