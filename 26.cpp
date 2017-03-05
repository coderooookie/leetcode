class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if (nums.empty()) return 0;
        int stepP = 1;
        for (int j = 1; j < nums.size(); j++)
        {   
            if (nums[j] != nums[j-1]) { nums[stepP] = nums[j]; stepP++; }
        }
        return stepP;
    }
};
