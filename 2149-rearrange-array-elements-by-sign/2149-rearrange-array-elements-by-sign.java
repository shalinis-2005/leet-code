class Solution {
    public int[] rearrangeArray(int[] nums) {
        int numsLength=nums.length,i;
        int[] finalAns=new int[numsLength];
        int[] pos=new int[numsLength/2];
        int[] neg=new int[numsLength/2];
        int posIndex=0,negIndex=0;
        for(i=0;i<numsLength;i++)
        {
            if(nums[i]>0)
            {
                pos[posIndex]=nums[i];
                posIndex++;
            }
            else
            {
                neg[negIndex]=nums[i];
                negIndex++;
            }
        }
        int FinalAnsIndex=0;
        for(i=0;i<numsLength/2;i++)
        {
            finalAns[FinalAnsIndex]=pos[i];
            finalAns[FinalAnsIndex+1]=neg[i];
            FinalAnsIndex=FinalAnsIndex+2;
        }
        return finalAns;
    }
}