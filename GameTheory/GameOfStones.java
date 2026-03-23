/*
Problem: Game of Stones 
Platform: HackerRank

Description:
Two players take turns removing 2, 3, or 5 stones from a pile.
Player who cannot make a move loses.

Task:
Determine the winner if both players play optimally.

Approach:(By observing the pattern):
- Observe pattern for small values of n.
- Losing positions occur when n % 7 == 0 or n % 7 == 1.
- In these cases, Second player wins.
- Otherwise, First player wins.

Example:
n = 1 → Second
n = 2 → First
n = 7 → Second

Time Complexity: O(1)
Space Complexity: O(1)
*/

public static String gameOfStones(int n) {
        if(n%7==0 || n%7==1){
            return "Second";
        }else{
            return "First";
        }
    }