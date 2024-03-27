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
		    int dff=a-b;
		    if(dff>10){
		        System.out.println(0);
		    }
		    else{
		        int ad=10-dff;
		        if(ad%3==0){
		            System.out.println(ad/3);
		        }
		        else{
		            System.out.println(ad/3+1);
		        }
		    }
		}

	}
}
