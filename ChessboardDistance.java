/*
Chessboard Distance
The Chessboard Distance for any two points 
(
�
1
,
�
1
)
(X 
1
​
 ,Y 
1
​
 ) and 
(
�
2
,
�
2
)
(X 
2
​
 ,Y 
2
​
 ) on a Cartesian plane is defined as 
�
�
�
(
∣
�
1
−
�
2
∣
,
∣
�
1
−
�
2
∣
)
max(∣X 
1
​
 −X 
2
​
 ∣,∣Y 
1
​
 −Y 
2
​
 ∣).

You are given two points 
(
�
1
,
�
1
)
(X 
1
​
 ,Y 
1
​
 ) and 
(
�
2
,
�
2
)
(X 
2
​
 ,Y 
2
​
 ). Output their Chessboard Distance.

Note that, 
∣
�
∣
∣P∣ denotes the absolute value of integer 
�
P. For example, 
∣
−
4
∣
=
4
∣−4∣=4 and 
∣
7
∣
=
7
∣7∣=7.

Input Format
First line will contain 
�
T, the number of test cases. Then the test cases follow.
Each test case consists of a single line of input containing 
4
4 space separated integers - 
�
1
,
�
1
,
�
2
,
�
2
X 
1
​
 ,Y 
1
​
 ,X 
2
​
 ,Y 
2
​
  - as defined in the problem statement.
Output Format
For each test case, output in a single line the chessboard distance between 
(
�
1
,
�
1
)
(X 
1
​
 ,Y 
1
​
 ) and 
(
�
2
,
�
2
)
(X 
2
​
 ,Y 
2
​
 )

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
1
,
�
2
,
�
2
≤
1
0
5
1≤X 
1
​
 ,Y 
1
​
 ,X 
2
​
 ,Y 
2
​
 ≤10 
5
 
Subtasks
Subtask #1 (100 points): original constraints

Sample 1:
Input
Output
3
2 4 5 1
5 5 5 3
1 4 3 3
3
2
2
Explanation:
In the first case, the distance between 
(
2
,
4
)
(2,4) and 
(
5
,
1
)
(5,1) is 
�
�
�
(
∣
2
−
5
∣
,
∣
4
−
1
∣
)
=
�
�
�
(
∣
−
3
∣
,
∣
3
∣
)
=
3
max(∣2−5∣,∣4−1∣)=max(∣−3∣,∣3∣)=3.

In the second case, the distance between 
(
5
,
5
)
(5,5) and 
(
5
,
3
)
(5,3) is 
�
�
�
(
∣
5
−
5
∣
,
∣
5
−
3
∣
)
=
�
�
�
(
∣
0
∣
,
∣
2
∣
)
=
2
max(∣5−5∣,∣5−3∣)=max(∣0∣,∣2∣)=2.

In the third case, the distance between 
(
1
,
4
)
(1,4) and 
(
3
,
3
)
(3,3) is 
�
�
�
(
∣
1
−
3
∣
,
∣
4
−
3
∣
)
=
�
�
�
(
∣
−
2
∣
,
∣
1
∣
)
=
2
max(∣1−3∣,∣4−3∣)=max(∣−2∣,∣1∣)=2.
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
		    int x1=input.nextInt();
		    int y1=input.nextInt();
		    int x2=input.nextInt();
		    int y2=input.nextInt();
		    int d1=x1-x2>0?x1-x2:(x1-x2)*-1;
		    int d2=y1-y2>0?y1-y2:(y1-y2)*-1;
		    System.out.println(Math.max(d1,d2));
		}

	}
}
