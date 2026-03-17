/*
Problem: Electronics Shop
Platform: HackerRank

Description:
A person wants to buy 1 keyboard and 1 USB drive within a given budget.
Given the price lists of keyboards and USB drives, find the maximum
amount that can be spent without exceeding the budget.
If it is not possible to buy both items, return -1.

Approach:
- Use brute force by checking all possible pairs of keyboard and drive prices
- For each pair, calculate the total cost
- If the total cost is within the budget and greater than current maximum, update it
- Return the maximum valid cost found

Time Complexity: O(n * m)
Space Complexity: O(1)
*/
static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max=-1;
        int m=keyboards.length,n=drives.length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int tot=keyboards[i]+drives[j];
                if(tot<=b && tot>max){
                    max=tot;
                }
            }
        }
        return max;
    }