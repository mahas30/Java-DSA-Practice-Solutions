/*
Problem: CamelCase (HackerRank)
Platform: HackerRank

Description:
A string is given in CamelCase format. In this format:
- The first word is entirely in lowercase.
- Each subsequent word starts with an uppercase letter followed by lowercase letters.

Task:
Determine the total number of words in the given string.

Logic:
- Each uppercase letter represents the start of a new word.
- So, total words = number of uppercase letters + 1.

Example:
Input:  saveChangesInTheEditor
Output: 5

Explanation:
The string contains the following words:
save, Changes, In, The, Editor

Time Complexity: O(n)
Space Complexity: O(1)
*/

public static int camelcase(String s) {
        int count=1;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))) count++;
        }
        return count;
    }
