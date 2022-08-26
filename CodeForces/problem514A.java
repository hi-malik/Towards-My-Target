import java.util.*;
public class problem514A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        StringBuilder sb = new StringBuilder();

        int a = s.charAt(0) - '0';
        if(a == 9) sb.append('9');
        else if(a > 4) sb.append((9 - a) + '0');
        // else sb.append(a + '0');

        for(int i = 1; i < s.length(); i++){
            int b = s.charAt(i) - '0';
            // if(b == 0 || b < 5) sb.append(b + '0');
            if(b == 0 || b < 5) continue;
            else sb.append((9 - b) + '0');
        }
        System.out.println(sb.toString());
    }
}
// Problem Link :- 