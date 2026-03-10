/*
Problem: Move Zeroes
Problem No: 283
Diificulty : Easy
Topic: Arrays, Two Pointers

Approach:
Use two pointers (left and right).
Right pointer scans the array.
When a non-zero element is found, swap it with the element at left pointer.
Increment left pointer.

Time Complexity: O(n)
Space Complexity: O(1)
*/
class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;

        for(int right=0;right<nums.length;right++){
            if(nums[right]!=0){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
            }
        }
    }
}
