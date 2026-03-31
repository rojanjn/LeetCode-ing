class Solution {
    /*
    Problem: Binary Search

    Given an integer array nums sorted in ascending order, and an integer target,
    return the index of target if it exists in the array. Otherwise, return -1.

    You must write an algorithm with O(log n) runtime complexity.

    Example 1:
    Input: nums = [-1,0,3,5,9,12], target = 9
    Output: 4

    Example 2:
    Input: nums = [-1,0,3,5,9,12], target = 2
    Output: -1

    Constraints:
    - 1 <= nums.length <= 10^4
    - -10^4 < nums[i], target < 10^4
    - All integers in nums are unique
    - nums is sorted in ascending order
    */

    public int search(int[] nums, int target) {
        // setting left and right boundaries
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            // finding the middle index
            int mid = left + (right - left) / 2;

            // case 1: return the middle index
            if (nums[mid] == target) {
                return mid;
            } 
            // case 2: discard the smaller half
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            // case 3: discard the bigger half
            else {
                right = mid - 1;
            }
        }

        // if we finish the search without finding the target, return -1
        return -1;
    }
}