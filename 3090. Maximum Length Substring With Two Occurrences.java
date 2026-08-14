public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int low = 0;
        int high = 0;
        int res = Integer.MIN_VALUE;
        while(high < s.length()){
            map.put(s.charAt(high),map.getOrDefault(s.charAt(high),0)+1);
            while(map.get(s.charAt(low)) > 2){
                map.put(s.charAt(low),map.get(s.charAt(low)) - 1);
                low++;
            }
            int len = high -low +1;
            res =Math.max(res,len);
            high++;
        }
        return res;
    }
