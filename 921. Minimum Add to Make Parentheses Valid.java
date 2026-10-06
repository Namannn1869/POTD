class Solution {
    public int minAddToMakeValid(String s) {
        int depth = 0;
        int c = 0 ;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                depth++;
            }
            else{
                if(depth>0){
                    depth--;
                }
                else{
                    c++;
                }
            }
        }
        return depth+c;
    }
}
