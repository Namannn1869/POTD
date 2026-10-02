class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack("",0,0,n,list);
        return list;
    }


    public static void backtrack( String s,int start,int end,int n,List<String> list){
        if(s.length()==2*n){
            list.add(s);

        }

        if(start<n){
            backtrack(s+"(",start+1,end,n,list);
        }
        if(end<start){
            backtrack(s+")",start,end+1,n,list);
        }
    }
}
