class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        double m = mass;
        for(int roid : asteroids){
            if(m<roid){
                return false;
            }
            m+=roid;
        }
        return true;
    }
}
