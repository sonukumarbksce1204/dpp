/*
The Last Levels
Chef is playing a videogame, and is getting close to the end. He decides to finish the rest of the game in a single session.

There are 
�
X levels remaining in the game, and each level takes Chef 
�
Y minutes to complete. To protect against eye strain, Chef also decides that every time he completes 
3
3 levels, he will take a 
�
Z minute break from playing. Note that there is no need to take this break if the game has been completed.

How much time (in minutes) will it take Chef to complete the game?

Input Format
The first line of input will contain a single integer 
�
T, denoting the number of test cases.
The first and only line of input will contain three space-separated integers 
�
X, 
�
Y, and 
�
Z.
Output Format
For each test case, output on a new line the answer — the length of Chef's gaming session.

Constraints
1
≤
�
≤
100
1≤T≤100
1
≤
�
≤
100
1≤X≤100
5
≤
�
≤
100
5≤Y≤100
5
≤
�
≤
15
5≤Z≤15
Sample 1:
Input
Output
4
2 12 10
3 12 10
7 20 8
24 45 15
24
36
156
1185
*/





import java.util.*;
import java.lang.*;
import java.io.*;

class TheLastLevels
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
		    int netime=x*y;
		    int extim=0;
		    while(x>3){
		    if(x%3==0)
    	       {
    	           extim = x/3;  
        	       netime += (extim-1)*z;
        	       x = x%3;
    	       }
    	       else
    	       {
    	           extim = x/3;  
        	       netime += extim*z;
        	       x = x%3;   
    	       }
		    }
		    System.out.println(netime);
		}

	}
}
