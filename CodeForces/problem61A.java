import java.util.*;
public class problem61A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s1.length(); i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if(ch1 == ch2){
                sb.append('0');
            }
            else sb.append('1');
        }
        System.out.println(sb.toString());
        // System.out.println("Print Here");
    }
}
// Problem Link :- 