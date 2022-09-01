import java.util.*;
public class problem131A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.matches("^[a-z]?[A-Z]*$")){
			String ans = s.toLowerCase();
			if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
				ans = ans.substring(0,1).toUpperCase() + ans.substring(1);
			s = ans;
		}
		System.out.println(s);
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/131/A