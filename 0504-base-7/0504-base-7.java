class Solution {
    public String convertToBase7(int num) {
        int n = num;
        String s = "";
        if(num<0){
            num = -(num);
        }
        if(num==0){
            return "0";
        }
        while(num>0){
            s+=num%7;
            num = num/7;
        }
        String str = new StringBuilder(s).reverse().toString();
        if(n>0) return str;
        return "-"+str;
    }
}