/*
 Problem: Jumping on the Clouds (Revisited)
 Platform: HackerRank

 Description:
 A character jumps across clouds in a circular manner starting from index 0.
 Each jump is of size k and costs 1 energy.
 If the character lands on a thundercloud (value = 1), an additional 2 energy is lost.
 The game ends when the character returns to index 0.
 Find the remaining energy.

 Approach:
 - Start at index 0 with energy = 100.
 - Jump in steps of k using modulo to wrap around.
 - For each jump:
    - Deduct 1 energy
    - If cloud is thundercloud, deduct extra 2 energy
 - Continue until we return to index 0.

 Logic:
 - index = (index + k) % n
 - energy -= 1
 - if(c[index] == 1) energy -= 2

 Time Complexity: O(n/k)
 Space Complexity: O(1)

 
*/
static int jumpingOnClouds(int[] c, int k) {
        int n=c.length;
        int index=0,energy=100;
        do{
            index=(index+k)%n;
            if(c[index]==1) energy-=2;
            energy-=1;
        }while(index!=0);
        return energy;
    }
