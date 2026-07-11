class Solution {
    public int[] dailyTemperatures(int[] nums) {
    Stack<Integer> s1=new Stack<>();
    int numsLength=nums.length;
    int[] ans=new int[numsLength];
        int index=numsLength-1;
        int i;
        for(i=numsLength-1;i>=0;i--)
        {
           while(!s1.isEmpty()&&nums[i]>=nums[s1.peek()])
           {
               s1.pop();
           }
           int topElement=s1.isEmpty()==true?0:Math.abs(i-s1.peek());
           ans[index--]=topElement;
           s1.push(i);
        }
        return ans;   
    }
}