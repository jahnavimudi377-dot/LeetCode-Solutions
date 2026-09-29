class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true;
        int j = s.length();
        String s1 = "";
        for(int i=0;i<s.length();i++){
            int val = s.charAt(i);
           if(Character.isLetterOrDigit(val)){
                s1+=Character.toLowerCase((char)val);
           }
        }
           String r = new StringBuilder(s1).reverse().toString();
           if(s1.equals(r)){
            return true;
           }
        return false;
    }
}