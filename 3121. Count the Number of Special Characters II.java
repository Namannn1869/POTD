class Solution {
    public int numberOfSpecialChars(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0 ; i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
            }
            else{
                char c =s.charAt(i);
                if(Character.isUpperCase(c)){
                    map.put(s.charAt(i), Math.min( map.get(s.charAt(i)),i)) ;
                }
                else{
                    map.put(s.charAt(i), Math.max( map.get(s.charAt(i)),i)) ;
                }
            }
        }
        int c =0;
        for(char i='a';i<='z';i++){
            if(map.containsKey(i) && map.containsKey((char) (i - 32)) && ( map.get(i)<map.get((char) (i-32)) ) ){
                 c++;
            }

        }
        return c;
    }
}
