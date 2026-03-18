/*
 Problem: Viral Advertising

 Description:
 HackerLand starts an advertisement campaign by sharing it with 5 people on day 1.
 Each day:
 - Half of the people who receive the ad like it.
 - Each person who likes the ad shares it with 3 new people the next day.

 The task is to find the total cumulative number of likes after n days.

 Approach:
 - Start with shared = 5 people on day 1.
 - For each day:
     1. Calculate likes = shared / 2
     2. Add likes to cumulative total
     3. Calculate next day's shared = likes * 3
 - Repeat this process for n days.

 Logic:
 - likes = shared / 2
 - shared = likes * 3
 - cumulative += likes

 Time Complexity: O(n)
 Space Complexity: O(1)

*/

public static int viralAdvertising(int n) {
        int shared=5,liked=0,sum=0;
        for(int i=0;i<n;i++){
            liked=(shared/2);
            sum+=liked;
            shared=liked*3;
        }
        return sum;
    }
