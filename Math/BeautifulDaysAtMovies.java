/*
 Problem: Beautiful Days at the Movies
 Platform: Hackerrank

 Description:
 A day is considered beautiful if the absolute difference between the day number
 and its reverse is divisible by k. Given a range from i to j, count the number
 of beautiful days.

 Approach:
 - Iterate from i to j.
 - Reverse each number.
 - Find the absolute difference between the number and its reverse.
 - Check if the difference is divisible by k.
 - Count such days.

 Logic:
 - Reverse number using: rev = rev * 10 + digit
 - Condition: Math.abs(num - rev) % k == 0

 Time Complexity: O(n * d)
 Space Complexity: O(1)
*/
 public static int beautifulDays(int i, int j, int k) {
        int bfdays=0;
        while(i<=j){
            int temp=i,rev=0;
            while(temp>0){
                int dig=temp%10;
                rev=rev*10+dig;
                temp=temp/10;
            }
            int dif=Math.abs(i-rev);
            if(dif%k==0) bfdays++;
            i++;
        }
        return bfdays;
    }
