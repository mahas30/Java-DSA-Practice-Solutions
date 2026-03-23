/*
Problem: Marc's Cakewalk (HackerRank)

Description:
Marc eats cupcakes with given calorie counts. After eating a cupcake,
he must walk 2^i * calories miles, where i is the number of cupcakes
already eaten.

Task:
Find the minimum number of miles Marc must walk by choosing the optimal
order of eating cupcakes.

Approach (Greedy):
1. Sort cupcakes in descending order.
2. Eat highest calorie cupcake first.
3. Multiply each calorie by 2^i and add to total.

Why?
- Higher calories should get smaller multipliers to minimize total.

Important Concept:
- (1L << i) is used to calculate 2^i efficiently.
- '<<' is the left shift operator.
- 1 << i shifts binary 1 by i positions → gives 2^i.
- Example:
    1 << 0 = 1  (2^0)
    1 << 1 = 2  (2^1)
    1 << 2 = 4  (2^2)
- '1L' is used instead of '1' to avoid integer overflow.
  It ensures the result is stored as a long.

Example:
Input: [1, 3, 2]
Sorted: [3, 2, 1]

Miles:
3 * 2^0 = 3
2 * 2^1 = 4
1 * 2^2 = 4

Total = 11

Time Complexity: O(n log n)
Space Complexity: O(1)
*/


public static long marcsCakewalk(List<Integer> calorie) {
        Collections.sort(calorie,Collections.reverseOrder());
        
        long totalmiles=0;
        for(int i=0;i<calorie.size();i++){
            totalmiles+=(long) calorie.get(i)*(1L << i);
        }
        return totalmiles;
    }