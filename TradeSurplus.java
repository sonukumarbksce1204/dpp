/*
Trade Surplus
Chefland consists of three countries named 
�
,
�
,
A,B, and 
�
C.

Country 
�
A exports goods worth 
�
1
A 
1
​
  units and imports goods worth 
�
2
A 
2
​
  units.
Country 
�
B exports goods worth 
�
1
B 
1
​
  units and imports goods worth 
�
2
B 
2
​
  units.
A trade surplus occurs when a country exports strictly more than it imports.
Find whether country 
�
C is in trade surplus.

Note that the countries 
�
,
�
,
�
A,B,C trade only between themselves.

Input Format
The first line of input will contain a single integer 
�
T, denoting the number of test cases.
Each test case consists of four space-separated integers 
�
1
,
�
2
,
�
1
A 
1
​
 ,A 
2
​
 ,B 
1
​
  and 
�
2
B 
2
​
  — denoting the exports and imports of countries 
�
A and 
�
B respectively.
Output Format
For each test case, output on a new line, YES, if country 
�
C is in trade surplus and NO otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings YES, yEs, yes, and yeS will all be treated as identical).

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
1
,
�
2
,
�
1
,
�
2
≤
100
1≤A 
1
​
 ,A 
2
​
 ,B 
1
​
 ,B 
2
​
 ≤100
Sample 1:
Input
Output
4
4 6 5 4
1 1 1 1
10 5 12 6
1 100 1 100
YES
NO
NO
YES
Explanation:
Let us define net export 
=
(
=(exports 
−
− imports
)
).

Test case 
1
1: Net export of country 
�
A is 
4
−
6
=
−
2
4−6=−2, while of country 
�
B is 
5
−
4
=
1
5−4=1. The net exports of countries 
�
A and 
�
B combined is 
−
2
+
1
=
−
1
−2+1=−1.
Thus, the net export of country 
�
C is 
1
1 and it is in trade surplus.

Test case 
2
2: Net export of country 
�
A is 
1
−
1
=
0
1−1=0, while of country 
�
B is 
1
−
1
=
0
1−1=0. The net exports of countries 
�
A and 
�
B combined is 
0
0.
Thus, the net export of country 
�
C is also 
0
0 and it is not in trade surplus.

Test case 
3
3: Net export of country 
�
A is 
10
−
5
=
5
10−5=5, while of country 
�
B is 
12
−
6
=
6
12−6=6. The net exports of countries 
�
A and 
�
B combined is 
11
11.
Thus, the net export of country 
�
C is 
−
11
−11 and it is not in trade surplus.
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
		    int ne=(a-b)+(c-d);
		    if(ne<0){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
