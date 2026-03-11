/*
Problem: Missing Number
Platform: LeetCode
Problem No: 268
Difficulty: Easy

Topic: Math, Arrays

Approach : Sum Difference

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for(int num : nums){
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}

/*
Approach: Sorting
Time Complexity: O(n log n)
Space Complexity: O(1)
*/


class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int num=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
}