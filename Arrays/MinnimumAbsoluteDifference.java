/*
Problem: Minimum Absolute Difference 
Platform: Hackerrank

Description:
Given an array of integers, find the minimum absolute difference between any two elements.

Task:
Return the smallest absolute difference between any pair of elements.

Approach:
1. Sort the array.
2. Compare only adjacent elements.
3. Track the minimum difference.

Why sorting?
- Closest numbers will be next to each other after sorting,hence reducing the time complexity from O(n^2) to O(n log n).

Example:
Input:  [3, -7, 0]
Sorted: [-7, 0, 3]
Differences: 7, 3 → Minimum = 3

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

public static int minimumAbsoluteDifference(List<Integer> arr) {
        int mindif=Integer.MAX_VALUE;
        Collections.sort(arr);
        
        for(int i=0;i<arr.size()-1;i++){
            int dif=Math.abs(arr.get(i)-arr.get(i+1));
            mindif=Math.min(dif,mindif);
        }
        return mindif;
    }