/*
Problem: Strong Password
Platform: HackerRank

Description:
A password is considered strong if it satisfies the following conditions:
1. Minimum length is 6 characters.
2. Contains at least one digit (0-9).
3. Contains at least one lowercase letter (a-z).
4. Contains at least one uppercase letter (A-Z).
5. Contains at least one special character (!@#$%^&*()-+).

Task:
Given a password string, find the minimum number of characters that must be added
to make the password strong.

Example:
Input:  n = 3, password = "Ab1"
Output: 3

Explanation:
Missing special character and length is less than 6.
Minimum additions required = 3.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public static int minimumNumber(int n, String password) {
        String numbers = "0123456789";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialChars = "!@#$%^&*()-+";
        
        boolean hasDigit=false;
        boolean hasUpper=false;
        boolean hasLower=false;
        boolean hasSpecial=false;
        
        for(char ch :password.toCharArray()){
            if(numbers.indexOf(ch)!=-1) hasDigit=true;
            if(lowerCase.indexOf(ch)!=-1) hasLower=true;
            if(upperCase.indexOf(ch)!=-1) hasUpper=true;
            if(specialChars.indexOf(ch)!=-1) hasSpecial=true;
        }
        
        int count=0;
        if(!hasDigit) count++;
        if(!hasLower) count++;
        if(!hasUpper) count++;
        if(!hasSpecial) count++;
        
        int lengthneeded=Math.max(0,6-n);
        int min =Math.max(count,lengthneeded);
        return min;
    }