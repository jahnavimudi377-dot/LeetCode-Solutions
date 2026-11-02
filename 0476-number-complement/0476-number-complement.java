class Solution {
    public int findComplement(int num) {
        String s ="";
        while(num>=2){
            s += num%2;
            num /= 2;
        }
        s+=num;
        int n =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                n += Math.pow(2,i);
            }
        }
        return n;
    }
}