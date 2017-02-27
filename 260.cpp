class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        vector<int> ans;
        int pointer=0;
        for (int i=0;i<nums.size();i++)
        {
    		
            for (int j=0;j<nums.size();j++)
            {
        		if (j==i && j!= nums.size() - 1) {continue;}
    			if (nums[j] == nums[i] && j!=i)
                {
                    break;
                }
    			if (j == nums.size()-1)
                {
    				ans.push_back(nums[i]);
                }
            }
    	}
        return ans;
    }
};
