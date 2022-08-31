import java.util.*;
public class problem118B{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String s[] = new String[n + 1];

        for(int i = 0; i <= n; i++){
            s[i] = "" + i;
            for(int j = i - 1; j >= 0; j--){
                s[i] = j + " " + s[i] + " " + j;
            }
            for(int j = 0; j < n - i; j++){
                s[i] = "  " + s[i];
            }
            System.out.println(s[i]);
        }
        for(int i = n - 1; i >= 0; i--){
            System.out.println(s[i]);
        }
    }
}
// Problem Link :- 