class Solution {
    public int removeElement(int[] nums, int val) {
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     list.add(nums[i]);
        // }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
               count++;
            }
        }
       return count;
    }
}