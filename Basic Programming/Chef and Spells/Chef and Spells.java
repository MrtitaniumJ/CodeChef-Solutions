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
		    int C = ja.nextInt();
		    int large = Math.max(A+B, A+C);
		    large = Math.max(large, B+C);
		    System.out.println(large);
		}
	}
}
