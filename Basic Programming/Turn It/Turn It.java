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
		    int U = ja.nextInt();
		    int V = ja.nextInt();
		    int A = ja.nextInt();
		    int S = ja.nextInt();
		    double v = Math.sqrt((U*U)-(2*A*S));
		    if (v>V) System.out.println("No");
		    else System.out.println("YES");
		}
	}
}
