class Solution {
    public int bitwiseComplement(int n) {
        String s = "";
        while(n>=2){
            s += n%2;
            n = n/2;
        }
        s+=n;
        int num = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                num += Math.pow(2,i);
            }
        }
        return num;
    }
}