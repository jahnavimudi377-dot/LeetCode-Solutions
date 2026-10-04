
class Solution {
    public void quickSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = nums[low];
        int lt = low;
        int mid = low;
        int gt = high;
        while (mid <= gt) {
            if (nums[mid] < pivot) {
                int temp = nums[lt];
                nums[lt] = nums[mid];
                nums[mid] = temp;
                lt++;
                mid++;
            } 
            else if (nums[mid] > pivot) {
                int temp = nums[mid];
                nums[mid] = nums[gt];
                nums[gt] = temp;
                gt--;
            } 
            else {
                mid++;
            }
        }
        quickSort(nums, low, lt - 1);
        quickSort(nums, gt + 1, high);
    }
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
}