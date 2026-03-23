/*
Problem: Mars Exploration
Platform: Hackerrank

Description:
A space explorer sends SOS messages to Earth. Due to cosmic radiation,
some characters may get altered during transmission.

Each SOS message is repeated multiple times:
Expected pattern = "SOS"

Task:
Given the received string, determine how many characters differ
from the expected repeating "SOS" pattern.

Example:
Input:  "SOSSPSSQSSOR"
Output: 3

Time Complexity: O(n)
Space Complexity: O(1)
*/

public static int marsExploration(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(i%3==0 && s.charAt(i)!='S') count++; 
            if(i%3==1 && s.charAt(i)!='O') count++; 
            if(i%3==2 && s.charAt(i)!='S') count++;   
        }
        return count;
    }

    