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
		Scanner ja =  new Scanner(System.in);
		int T = ja.nextInt();
		while(T-->0){
		    int w1 = ja.nextInt();
		    int w2 = ja.nextInt();
		    int x1 = ja.nextInt();
		    int x2 = ja.nextInt();
		    int M = ja.nextInt();
		    if((w2-w1) >= (x1*M) && (w2-w1) <= (x2*M))
		        System.out.println(1);
	        else System.out.println(0);
		}
	}
}
