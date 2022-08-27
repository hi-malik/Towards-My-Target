import java.util.*;
public class problem785A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("Tetrahedron", 4);
        map.put("Cube", 6);
        map.put("Octahedron", 8);
        map.put("Dodecahedron", 12);
        map.put("Icosahedron", 20);

        while(n --> 0){
            String s = scn.next();

            if(map.containsKey(s)){
                sum += map.get(s);
            }
        }
        System.out.println(sum);
    }
}
// Problem Link :- https://codeforces.com/problemset/problem/785/A