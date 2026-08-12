class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder  ans =new StringBuilder();
        char[]arr= s.toCharArray();
        for(int i=arr.length-1;i>=k;i--){
            ans.append(arr[i]);
        }
        for(int i=0;i<k;i++){
            ans.append(arr[i]);
        }
        return ans.reverse().toString();
    }
}