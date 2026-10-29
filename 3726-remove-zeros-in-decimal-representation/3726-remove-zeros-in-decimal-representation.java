class Solution {
    public long removeZeros(long n) {
        long res = 0;
        long p =1;
        while(n>0){
            long d = n%10;
            if(n%10!=0){
                res+=p*d;
                p *= 10;
            }
            n /= 10;
        }
        return res;
    }
}