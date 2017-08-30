class Solution {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        Stack<Integer> s = new Stack();
        int max = 0;
        for (int i = 0; i <= len; i++){
            int iNum = (i == len ? 0 : heights[i]);
            if (s.empty() || iNum >= heights[s.peek()]){s.push(i);}
            else{
                while (!s.empty() && heights[s.peek()] > iNum){
                    int tmp = s.pop();
                    max = Integer.max(max, heights[tmp] * (s.empty() ? i : i-s.peek()-1));
                }
                s.push(i);
            }
        }
        return max;
    }
}