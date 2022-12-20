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
		    int L = ja.nextInt();
		    int R = ja.nextInt();
		    System.out.println((2*R - 2*L)+1);
		}
	}
}
