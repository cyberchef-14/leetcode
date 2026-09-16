class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            int count=0;
            String idx=Integer.toBinaryString(i);
            for(char ch : idx.toCharArray()){
                if((ch-'0')==1) count++;
            }
            if(count==k){
                sum+=nums.get(i);
            }
        }
        return sum;
    }
}