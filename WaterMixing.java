/*
Water Mixing
Chef is setting up a perfect bath for himself. He has 
�
X litres of hot water and 
�
Y litres of cold water.
The initial temperature of water in his bathtub is 
�
A degrees. On mixing water, the temperature of the bathtub changes as following:

The temperature rises by 
1
1 degree on mixing 
1
1 litre of hot water.
The temperature drops by 
1
1 degree on mixing 
1
1 litre of cold water.
Determine whether he can set the temperature to 
�
B degrees for a perfect bath.

Input Format
The first line of input will contain a single integer 
�
T, denoting the number of test cases.
Each test case consists of four space-separated integers 
�
,
�
,
�
,
A,B,X, and 
�
Y — the initial temperature of bathtub, the desired temperature of bathtub, the amount of hot water in litres, and the amount of cold water in litres respectively.
Output Format
For each test case, output on a new line, YES if Chef can get the desired temperature for his bath, and NO otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).

Constraints
1
≤
�
≤
2000
1≤T≤2000
20
≤
�
,
�
≤
40
20≤A,B≤40
0
≤
�
,
�
≤
20
0≤X,Y≤20
Sample 1:
Input
Output
4
24 25 2 0
37 37 2 9
30 20 10 9
30 31 0 20
YES
YES
NO
NO
Explanation:
Test case 
1
1: The initial temperature of water is 
24
24 and the desired temperature is 
25
25. Chef has 
2
2 litres of hot water. He can add 
1
1 litre hot water in the tub and change the temperature to 
24
+
1
=
25
24+1=25 degrees.

Test case 
2
2: The initial temperature of water is 
37
37 and the desired temperature is also 
37
37. Thus, Chef does not need to add any more water in the bathtub.

Test case 
3
3: The initial temperature of water is 
30
30 and the desired temperature is 
20
20. Chef needs to add 
10
10 litres of cold water to reach the desired temperature. Since he only has 
9
9 litres of cold water, he cannot reach the desired temperature.

Test case 
4
4: The initial temperature of water is 
30
30 and the desired temperature is 
31
31. Chef needs to add 
1
1 litre of hot water to reach the desired temperature. Since he has no hot water, he cannot reach the desired temperature.
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
		    int a=input.nextInt();
		    int b=input.nextInt();
		    int c=input.nextInt();
		    int d=input.nextInt();
		    if(a==b){
		        System.out.println("YES");
		        //break;
		    }
		    else if(a>b){
		        int val=a-b;
		        System.out.println(val<=d?"YES":"NO");
		    }
		    else{
		        int val=b-a;
		        System.out.println(val<=c?"YES":"NO");
		    }
		}

	}
}
