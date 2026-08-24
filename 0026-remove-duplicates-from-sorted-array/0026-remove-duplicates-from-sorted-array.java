class Solution {
    public int removeDuplicates(int[] nums) {
      int k =1;
      for(int i=1;i<nums.length;i++){
            nums[0] = nums[0];
        if(nums[i-1]!=nums[i]){
            nums[k] = nums[i];
            k++;
    
        }
      } 
      return k; 
    }
}