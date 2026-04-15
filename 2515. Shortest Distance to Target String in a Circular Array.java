class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int right = 0;
        int left = 0;
        int dist = startIndex;
        
        if(words[startIndex].equals(target)){
            return 0;
        }

        boolean found = false;
        for(String word : words){
            if(word.equals(target)){
                found = true;
            }
        }

        if(!found){
            return -1;
        }

        int i = startIndex;
        while (!words[i].equals(target)) {
            i = (i + 1) % words.length;
            right++;
        }

        int j = startIndex;
        while (!words[j].equals(target)) {
            j = (j - 1 + words.length) % words.length;
            left++;
        }

        dist = Math.min(right,left);

        return dist;
    }
}
