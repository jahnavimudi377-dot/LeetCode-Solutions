class Solution {
    public long removeZeros(long n) {
        long d = 0;
        while(n>0){
            if(n%10!=0){
            d = d*10+n%10;
            }
            n /= 10;
        }
        long rev =0;
        while(d>0){
            rev = rev*10+d%10;
            d /= 10;
        }
        return rev;
    }
}