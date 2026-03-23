/*
Problem: Caesar Cipher 
Platform: HackerRank

Description:
Julius Caesar used a cipher to encrypt his messages by shifting each letter
in the alphabet by a fixed number (k).

- If the shift goes beyond 'z', it wraps around to 'a'.
- Case must be preserved (uppercase stays uppercase, lowercase stays lowercase).
- Non-alphabet characters (like '-', '@') remain unchanged.

Task:
Given a string and an integer k, return the encrypted string.

Approach:
1. Traverse each character in the string.
2. If it's a lowercase letter:
   - Shift within 'a' to 'z' using modulo (26).
3. If it's an uppercase letter:
   - Shift within 'A' to 'Z' using modulo (26).
4. If it's not a letter:
   - Keep it unchanged.

Example:
Input:  s = "middle-Outz", k = 2
Output: "okffng-Qwvb"

Time Complexity: O(n)
Space Complexity: O(n)
*/

public static String caesarCipher(String s, int k) {
        StringBuilder res=new StringBuilder();
        k=k%26;
        for(char ch :s.toCharArray()){
            if(Character.isLowerCase(ch)){
                char shifted=(char)((ch-'a'+k)%26+'a');
                res.append(shifted);
            }
            else if(Character.isUpperCase(ch)){
                char shifted=(char)((ch-'A'+k)%26+'A');
                res.append(shifted);
            }
            else{
                res.append(ch);
            }
        }
        return res.toString();
    }
