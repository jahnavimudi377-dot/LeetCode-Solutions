class Solution {
    public String reverseByType(String s) {
        String s1 = "";
        String s2 = "";
        for(int i=s.length()-1;i>=0;i--){
            char a = s.charAt(i);
            if(Character.isLetter(a)){
                s1 +=a;
            }else{
                s2 += a;
            }
        }
        String rs = "";
        int x = 0;
        int y =0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                rs += s1.charAt(x);
                x++;
            }
            else{
                rs += s2.charAt(y);
                y++;
            }
        }
        return rs;
    }
}