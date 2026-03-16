/*
Problem: Time Conversion
Platform: HackerRank

Problem Statement:
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Example:
Input: 07:05:45PM
Output: 19:05:45

Time Complexity: O(1)
Space Complexity: O(1)
*/
public static String timeConversion(String s) {

    int hour = Integer.parseInt(s.substring(0,2));
    String rest = s.substring(2,8);

    if(s.contains("AM")){
        if(hour == 12){
            hour = 0;
        }
    }

    if(s.contains("PM")){
        if(hour != 12){
            hour += 12;
        }
    }

    return String.format("%02d", hour) + rest;
}