class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<word.length();i++){
            set.add(word.charAt(i));
        }
        int count=0;
        for(char c : set){
            int character = (int) c;
            if(set.contains( (char) (character + 32)) || set.contains((char) (character - 32))){
                count++;
               
            }
        }
        return count/2;
    }
}
