/*
 Problem: Save the Prisoner
 Platform:Hackerrank

 Description:
 Sweets are distributed to prisoners sitting in a circular manner.
 Starting from seat s, one sweet is given to each prisoner.
 The last sweet is bad — find which prisoner receives it.

 Approach:
 - Use modulo arithmetic to avoid simulation.
 - Final position = (s + m - 1) % n
 - If result is 0, return n.

 Time Complexity: O(1)
 Space Complexity: O(1)

*/

 public static int saveThePrisoner(int n, int m, int s) {
        int res=(s+m-1)%n;
        if(res==0) return n;
        else return res;
    }