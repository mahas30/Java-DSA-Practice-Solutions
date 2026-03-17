/*
Problem: Day of the Programmer
Platform: HackerRank

Description:
Find the date of the 256th day (Day of the Programmer) for a given year.
The result should be in the format dd.mm.yyyy.

Key Concepts:
- Julian Calendar (1700–1917): Leap year if divisible by 4
- Gregorian Calendar (1919–2700): Leap year if divisible by 400 
  OR divisible by 4 and not divisible by 100
- Special Case: Year 1918 (calendar transition, Feb skipped 13 days)

Logic:
- If year == 1918 → return "26.09.1918"
- If leap year → return "12.09.yyyy"
- Else → return "13.09.yyyy"

Time Complexity: O(1)
Space Complexity: O(1)
*/

public static String dayOfProgrammer(int year) {
        if(year==1918) return "26.09.1918";
        boolean leap;
        
        if(year<1918){
            leap=(year%4==0);
        }else{
            leap=(year%400==0)||(year%4==0 && year%100!=0);
        }
        
        if(leap) return "12.09."+year;
        else return "13.09."+year;
    }
