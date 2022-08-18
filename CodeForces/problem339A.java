import java.util.*;
public class problem339A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        // if(s.length() == 1){
        //     System.out.println(s);
        // }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int a;
            if(Character.isLetterOrDigit(ch)){
                a = ch - '0';
                list.add(a);
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i));
            if(i != list.size() - 1){
                sb.append("+");
            }
        }
        System.out.println(sb.toString());
        // System.out.println("Print Here");
    }
}
