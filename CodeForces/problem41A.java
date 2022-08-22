import java.util.*;
public class problem41A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        String s1 = scn.next();
        String s2 = scn.next();

        if(s1.length() != s2.length()) {
            System.out.println("NO"); 
            return;
        }

        String rev = "";
        for(int i = s1.length() - 1; i >= 0; i--){
                char ch = s1.charAt(i);
                rev+= ch;
        }
        if(s2.equals(rev)) System.out.println("YES");
        else System.out.println("NO");

        // By mistake implement Map, not considering 3rd test case. lol
        // Map<Character, Integer> map = new HashMap<>();

        // for(int i = 0; i < s1.length(); i++){
        //     char ch = s1.charAt(i);
        //     map.put(ch, map.getOrDefault(ch, 0) + 1);
        // }

        // for(int i = 0; i < s2.length(); i++){
        //     char ch = s2.charAt(i);
        //     if(map.containsKey(ch)){
        //         map.put(ch, map.get(ch) - 1);
        //         if(map.get(ch) == 0) map.remove(ch);
        //     }
        // }
        // if(map.size() == 0) System.out.println("YES");
        // else System.out.println("NO");
        // System.out.println("Print Here");
    }
}
