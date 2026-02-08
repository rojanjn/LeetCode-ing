class Solution {
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