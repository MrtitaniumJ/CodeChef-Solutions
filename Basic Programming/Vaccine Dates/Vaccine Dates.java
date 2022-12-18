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
		int t = ja.nextInt();
		while(t-->0){
		    int D = ja.nextInt();
		    int L = ja.nextInt();
		    int R = ja.nextInt();
		    if(L <= D && D <= R) System.out.println("Take second dose now");
		    else if(L <= R && D>=R) System.out.println("Too Late");
		    else System.out.println("Too Early");
		}
	}
}
