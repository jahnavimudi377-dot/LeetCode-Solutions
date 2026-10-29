class Solution {
    public int digitFrequencyScore(int n) {
        int[] freq = new int[10];
        int num = n;
        while(num>0){
            freq[num%10]++;
            num /= 10;
        }
        int d = 0;
        for(int i=0;i<freq.length;i++){
            d += freq[i]*i;
        }
        return d;
    }
}