/*
Problem: Majority Element
Platform: LeetCode
Problem No: 169
Difficulty: Easy
Topic: Arrays

Problem Statement:
Given an integer array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n/2⌋ times.
You may assume that the majority element always exists in the array.

Approach: Sorting and returning the middle element.

Time Complexity: O(n log n)  (due to sorting)
Space Complexity: O(1)

Key Concept:
If an element appears more than half of the array size,
it will always appear in the middle after sorting.
*/
import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
/*Expanded version */
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }
            int n=nums.length/2;
            if(count>n){
                return nums[i];
            }
        }
        return nums[0];
    }
}