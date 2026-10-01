class Solution {
    public int lengthOfLongestSubstring(String s) {
        String cs = "";
        int j=0;
        int max = 0;
        for(int i=0;i<s.length();i++){
            if(cs.contains(String.valueOf(s.charAt(i)))){
                while(cs.contains(String.valueOf(s.charAt(i)))){
                    cs= cs.substring(1);
                    j++;
                }
            }
                cs+=s.charAt(i);
                max = Math.max(max,i-j+1);
        }
        return max;      
    }
}