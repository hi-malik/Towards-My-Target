import java.util.*;
public class problem1391B{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t --> 0){
            solve();
        }
    }
    public static void solve(){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int ans = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                String s = scn.nextLine();
                if(s.charAt(s.length() - 1) == 'C') continue;
                if(i == n && s.charAt(s.length() - 1) == 'D') ans++;
                if(j == m && s.charAt(s.length() - 1) == 'R') ans++;
            }
        }
        System.out.println(ans);
    }
}
// Problem Link :- 