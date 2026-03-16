/*
Problem: Super Reduced String
Platform: HackerRank

Problem Statement:
Given a string consisting of lowercase letters, repeatedly remove pairs 
of adjacent equal characters until no such pairs remain. 
If the final string becomes empty, return "Empty String".

Approach:
Traverse the string and use a stack-like method (StringBuilder).
If the current character is the same as the last character in the result,
remove the last character; otherwise append the current character.

Time Complexity: O(n)
Space Complexity: O(n)
*/
public static String superReducedString(String s) {
    StringBuilder res=new StringBuilder();
    
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        
        if(res.length()>0 && res.charAt(res.length()-1)==c){
            res.deleteCharAt(res.length()-1);
        }else{
            res.append(c);
        }
    }
    
    if(res.length()==0){
        return "Empty String";
    }
    return res.toString();
}
