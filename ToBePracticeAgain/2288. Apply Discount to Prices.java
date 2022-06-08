// Better
// Time Complexity: O(n)
// Space Complexity: O(n)

// Day-1 complete at 8thJune2022

class Solution {
    public String discountPrices(String sentence, int discount) {
        String str[] = sentence.split(" ");
        for(int i = 0; i < str.length; i++){
            if(str[i].charAt(0) != '$' || str[i].length() < 2) continue;
            
            long ans = 0;
            boolean flag = true;
            
            for(int j = 1; j < str[i].length(); j++){
                char ch = str[i].charAt(j);
                if(Character.isDigit(ch)){
                    ans *= 10;
                    ans += ch - '0';
                }
                else {
                    flag = false;
                    break;
                }
            }
            if(flag){
                double descount = ans * 0.01 * discount;
                descount = (double)ans - descount;
                str[i] = "$" + String.format("%.2f", descount); 
            }
        }
        return String.join(" ", str);
    }
}