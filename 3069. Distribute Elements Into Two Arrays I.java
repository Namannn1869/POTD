class Solution {
    public int[] resultArray(int[] nums) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(nums[0]);
        list2.add(nums[1]);
        for(int x=2;x<nums.length;x++){
            if(list1.get(list1.size()-1) > list2.get(list2.size()-1)){
                list1.add(nums[x]);
            }
            else{
                list2.add(nums[x]);
            }
        }
        int c = 0;
        int[] arr = new int[list1.size() + list2.size()];
        for(int  i = 0 ; i < list1.size() ;i++){
            arr[c++] = list1.get(i);
        }

        for(int j = 0 ;j < list2.size() ;j++){
            arr[c++] = list2.get(j);
        }

        return arr;
        
    }
}
