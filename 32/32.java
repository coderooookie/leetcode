class Solution {
    public int longestValidParentheses(String s) {
        int len = s.length();
        int[] check = new int[len];
        Stack<Integer> left = new Stack();
        Stack<Integer> right = new Stack();
        for (int i = 0; i < len; i++){
            if (s.charAt(i) == '('){left.push(i);}
            else if (!left.empty()){
                check[left.pop()] = 1;
                check[i] = 1;
            }
        }
        int ans = 0;
        for (int i = 0; i < len; i++){
            if (check[i] == 1){
                check[i] = i > 0 ? check[i-1] + 1 : 1;
                ans = Integer.max(ans,check[i]);
            }
        }
        return ans;
    }
}
