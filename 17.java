public class Solution {
    public List<String> letterCombinations(String digits) {
        String[] maps = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        LinkedList<String> ans = new LinkedList();
        if (digits == null || digits.length() == 0){return ans;}
        int len = digits.length();
        ans.push("");
        for (int i = 0; i < len; i++){
            while (ans.peek().length() == i){
                String dealing = ans.remove();
                String map = maps[Character.getNumericValue(digits.charAt(i))];
                int lenMap = map.length();
                for (int j = 0; j < lenMap; j++){
                    ans.add(dealing+map.charAt(j));
                }
            }
        }
        return ans;
        
    }
}
