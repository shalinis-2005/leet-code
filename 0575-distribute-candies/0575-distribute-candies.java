class Solution {
    public int distributeCandies(int[] candyType) {
       HashSet<Integer> set=new HashSet<>();
       for(int candy:candyType) 
       {
        set.add(candy);
       }
       int totalCandies=candyType.length;
       int maxCandiesAliceCanEat=totalCandies/2;
       return Math.min(set.size(),maxCandiesAliceCanEat);
    }
}