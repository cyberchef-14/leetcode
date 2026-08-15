class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        int a=-1;
        int b=0;
        for(int i:nums){
            xor^=i;
            if(i!=0) a=b;
            b++;
        }
        if(xor !=0) return nums.length;
        return (a==-1)? 0 : nums.length-1;
    }
}