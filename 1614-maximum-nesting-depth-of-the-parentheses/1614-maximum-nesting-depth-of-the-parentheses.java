class Solution {
    char stack[];
    int top = -1;
    public void push(char c){
        top++;
        stack[top] = c;
    }
        int cou = 0;
        int max = 0;
    public int pop(){
        while(top!=-1){
        if(stack[top]=='('){
            cou++;
            top--;
            max = Math.max(cou,max);   
        }
        else{
            top--;
            cou--;
        }
        }
        return max;
    }
    public int maxDepth(String s) {
        Solution ps = new Solution();
        ps.stack = new char[s.length()];
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='(' || s.charAt(i)==')'){
                ps.push(s.charAt(i));
            }
        }
        return ps.pop();
    }
}