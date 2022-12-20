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
		    int N = ja.nextInt();
		    if(((N-1)/2)%2 == 0) System.out.println(N-1);
		    else System.out.println(N);
		}
	}
}
