def lengthofLIS( nums): 
    lengthNums = len(nums)
    LISNums=[]
    for i in range(0,lengthNums): 
        LISNums.append(1)
    print LISNums
    for i in range(lengthNums-1,-1,-1): 
        maxNums = LISNums[i]
        for j in range(i+1,lengthNums): 
            if (nums[j] > nums[i] and maxNums < (LISNums[i] + LISNums[j])): 
                maxNums = LISNums[i] + LISNums[j] 
        LISNums[i] = maxNums
    print nums
    print max(LISNums)
   # for i in range(LISNums):
        

if __name__=="__main__":
    lengthofLIS([3,1,2,4,5,3,6,7])

