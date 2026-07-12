import java.util.*;
class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= stack.peek())
             {
                stack.pop();
             }
            if (stack.isEmpty())
             {
                list.add(-1);
             }
             else
              {
                list.add(stack.peek());
              }
            stack.push(arr[i]);
        }
        Collections.reverse(list);
        return list;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = nextLargerElement(nums2);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++)
         {
            map.put(nums2[i], i);
         }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int index = map.get(nums1[i]);
            ans[i] = arr.get(index);
        }
        return ans;
    }
}