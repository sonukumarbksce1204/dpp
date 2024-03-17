/*
Fill Candies
Chef received 
�
N candies on his birthday. He wants to put these candies in some bags. A bag has 
�
K pockets and each pocket can hold at most 
�
M candies. Find the minimum number of bags Chef needs so that he can put every candy into a bag.

Input Format
The first line of input will contain a single integer 
�
T, denoting the number of test cases.
Each test case consists of a single line containing three space-separated integers 
�
,
�
,
�
N,K,M.
Output Format
For each test case, print the minimum number of bags Chef needs so that he can put all the candies in one of the bags.

Constraints
1
≤
�
≤
1000
1≤T≤1000
1
≤
�
,
�
,
�
≤
100
1≤N,K,M≤100
Sample 1:
Input
Output
4
6 2 3
3 1 2
8 4 1
25 4 2
1
2
2
4
Explanation:
Test case 
1
1: Chef puts 
3
3 candies in the first pocket of a bag and the remaining 
3
3 candies in the second pocket. Thus Chef will need only one bag.

Test case 
2
2: Chef puts 
2
2 candies in the only pocket of the first bag and the remaining 
1
1 candy in the only pocket of the second bag. Thus Chef will need two bags.

Test case 
3
3: Chef puts 
4
4 candies in the first bag, one candy in each of the 
4
4 pockets and the same for the second bag. Thus Chef will need two bags.

Test case 
4
4: Chef puts 
2
2 candies in each of the 
4
4 pockets of three bags, one candy in a pocket of the fourth bag.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		while(n-- >0){
		    int x=input.nextInt();
		    int y=input.nextInt();
		    int z=input.nextInt();
		    double rew=Math.ceil((double)x/((double)y*(double)z));
		    //int req=(int)Math.ceil(x/(y*z));
		    System.out.println((int)rew);
		}

	}
}
