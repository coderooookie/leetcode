class Solution {
public:
    vector<int> constructRectangle(int area) {
        int sqrtArea = (int)sqrt((float)area);
        int L,W;
    	for (int i=sqrtArea;i>0;i--)
    	{
    		if (area % i == 0)
    		{
    			W = i;
    			L = area/W;
    			break;
    		}
    	}
	    vector<int> ans = {L,W};
        return ans;
    }
};
