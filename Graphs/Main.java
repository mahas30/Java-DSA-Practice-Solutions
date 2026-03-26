/*
Problem: Find the Youngest Family Member

Description:
In a royal family, members exchange gifts during Christmas. Each gift is represented
as a directed relationship where person 'a' gives a gift to person 'b'.

The youngest member of the family is defined as:
1. A person who receives gifts from all other members (in-degree = n - 1)
2. A person who does not give any gifts to others (out-degree = 0)

Given the total number of members (n) and a list of gift exchanges (m pairs),
identify the youngest member.

If no such member exists, return -1.

Input:
- Integer n → number of family members
- Integer m → number of gift exchanges
- m pairs (a, b) → person 'a' gives a gift to person 'b'

Output:
- Integer representing the youngest member
- If no valid member exists, output -1

Approach:
- Use two arrays:
  inDegree[i] → number of gifts received by member i
  outDegree[i] → number of gifts given by member i
- Traverse all gift pairs and update in-degree and out-degree
- Identify the member who satisfies:
  inDegree[i] == n - 1 AND outDegree[i] == 0

Time Complexity: O(n + m)
Space Complexity: O(n)

*/
public class Main {
    public static void find_youngest_member(int n, int m, int[][] gifts) {
        int[] in_degree=new int[n+1];
        int[] out_degree=new int[n+1];

        for(int i=0;i<m;i++){
            int giver=gifts[i][0];
            int receiver=gifts[i][1];

            in_degree[receiver]++;
            out_degree[giver]++;
        }
        for(int i=1;i<=n;i++){
            if(in_degree[i]==n-1 && out_degree[i]==0){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}