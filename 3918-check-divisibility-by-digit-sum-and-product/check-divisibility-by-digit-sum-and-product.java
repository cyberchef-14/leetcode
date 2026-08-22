class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int pro=1;
        int number=n;
        while(n!=0){
            int num=n%10;
            sum+=num;
            pro*=num;
            n/=10;
        }
        return number%(sum+pro)==0;
    }
}