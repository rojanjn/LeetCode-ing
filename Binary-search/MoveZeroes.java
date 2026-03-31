class Solution {
    /*
    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

    Note that you must do this in-place without making a copy of the array.

    Example 1:

    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
    Example 2:

    Input: nums = [0]
    Output: [0]
    
    Constraints:
    1 <= nums.length <= 104
    -231 <= nums[i] <= 231 - 1
    */
   
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                // System.out.println("i=" + i + " j=" + j + " nums[i]=" + nums[i] + " nums[j]=" + nums[j]);
                if (nums[j] == 0) {
                    // System.out.println("detected nums[i]=0; swapping " + i + " " + (i + 1));
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j+1] = tmp;
                }
                // System.out.println(Arrays.toString(nums));
            }
        }
        // return nums;
    }
}