class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueSet = new HashSet();
        for(int num: nums){
            if(!uniqueSet.add(num)){
                return true;
            }
        }
        return false;
    }
}