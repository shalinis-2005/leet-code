class Solution {
    int FindFirstIndex(int[] arr,int target)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                if(mid==0||arr[mid]!=arr[mid-1])
                {
                    return mid;
                }
                else
                {
                    high=mid-1;
                }
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return -1;
    }
        int FindLastIndex(int[]arr,int target)
        {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                if(mid==arr.length-1||arr[mid]!=arr[mid+1])
                {
                    return mid;
                }
                else
                {
                    low=mid+1;
                }
            }
             else if(arr[mid]<target)
            {
                low=mid+1; 
            }
            else
            {
                high=mid-1;
            }
        }
            return -1;
        }
    public int[] searchRange(int[] nums,int target) {
        int startIndex=FindFirstIndex(nums,target);
        int lastIndex=FindLastIndex(nums,target);
        int[] ans=new int[2];
        ans[0]=startIndex;
        ans[1]=lastIndex;
        return ans;
        }
    }
     