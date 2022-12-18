/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner ja = new Scanner(System.in);
		int T = ja.nextInt();
		while(T-->0){
		    int A = ja.nextInt();
		    int B = ja.nextInt();
		    int A1 = ja.nextInt();
		    int B1 = ja.nextInt();
		    int A2 = ja.nextInt();
		    int B2 = ja.nextInt();
		    if(A == A1 && B == B1||A == B1 && B == A1){
		        System.out.println(1);
		    }
		    else if(A == A2 && B == B2 || A == B2 && B == A2){
		        System.out.println(2);
		    }
		    else {
		        System.out.println(0);
		    }
		}
	}
}
