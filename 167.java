public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int cur = numbers.length - 1;
        for (int i = 0; i < numbers.length; ++i)
        {
            while (numbers[i] + numbers[cur] > target){ cur --; }
            if (numbers[i] + numbers[cur] == target) { return new int[]{i+1,cur+1};}
        }
        return new int[] {0,0};
    }
}
