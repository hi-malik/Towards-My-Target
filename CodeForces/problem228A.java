import java.util.*;
public class problem228A{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int arr[] = new int[4];

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < 4; i++){
            arr[i] = scn.nextInt();
        }

        for(int i = 0; i < 4; i++){
            set.add(arr[i]);
        }
        System.out.println(4 - set.size());
        // System.out.println("Print Here");
    }
}
// Problem Link :- 