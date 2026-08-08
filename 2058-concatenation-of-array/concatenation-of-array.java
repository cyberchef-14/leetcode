class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr=new int[nums.length*2];
        int[] res = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            arr[i+nums.length]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i];
        }
        for(int i=nums.length;i<res.length;i++){
            res[i]=arr[i];
        }
        return res;
    }
}