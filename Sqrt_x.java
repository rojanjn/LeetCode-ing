/*
Problem No. 69

Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

*/

class Solution {
    public int mySqrt(int x) {
        if (x == 0) return x;
        if (x == 1) return x;

        int start = 1, end = x, mid = -1;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (mid > x / mid) end = mid -1;
            else if (mid*mid == x) return mid;
            else start = mid + 1;
        }

        return Math.round(end);
    }
}