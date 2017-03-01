class Solution {
public:
    void moveZeroes(vector<int>& nums) {
    	int count = 0;
    	for (std::vector<int>::iterator num = nums.begin(); num != nums.end(); ++num)
    	{
    		if (*num == 0){count ++;}
    		else if (count > 0){*(num - count)= *num;}
    	}
    	for (std::vector<int>::iterator num = nums.end()-1; num != (nums.end() - 1 - count); --num)
    	{
    		*num = 0;
    	}
    }
};
