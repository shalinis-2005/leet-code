class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        int numsLength=nums.length;
        int start=0,end=nums.length-1;
        while(start<end)
        {
            int sum=nums[start]+nums[end];
            if(target==sum)
            {
                ans[0]=start+1;
                ans[1]=end+1;
                return ans;
            }
            else if(sum<target)
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        return ans;    
    }
}