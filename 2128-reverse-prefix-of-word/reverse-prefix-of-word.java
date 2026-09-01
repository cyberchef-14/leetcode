class Solution {
    public String reversePrefix(String word, char ch) {
        String s ="";
        char[] arr= word.toCharArray();
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch){
                idx=i;
                break;
            }
        }

        for(int i=idx;i>=0;i--){
                s+=arr[i];
        }

        for(int i=idx+1;i<arr.length;i++){
            s+=arr[i];
        }
        return s;
    }
}