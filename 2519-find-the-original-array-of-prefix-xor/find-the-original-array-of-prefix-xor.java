class Solution {
    public int[] findArray(int[] nums) {
        for(int i=nums.length-1;i>0;i--){
            nums[i]^=nums[i-1];
        }
        return nums;
    }
}