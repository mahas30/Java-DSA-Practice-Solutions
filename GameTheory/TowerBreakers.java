/*
Problem: Tower Breakers 
Platforrm: HackerRank

Description:
Two players play a game with n towers, each of height m.
Players take turns reducing a tower to a smaller height that divides it.

Task:
Determine the winner assuming both players play optimally.

Key Observations:
1. If m == 1:
   - No moves possible → First player loses → Second wins.

2. If n is even:
   - Second player can mirror First player's moves → Second wins.

3. If n is odd and m > 1:
   - First player has advantage → First wins.

Conclusion:
- If (m == 1) OR (n % 2 == 0) → Second wins (return 2)
- Else → First wins (return 1)

Time Complexity: O(1)
Space Complexity: O(1)
*/

public static int towerBreakers(int n, int m) {
        if(m==1 || n%2==0) return 2;
        return 1;
    }
