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
		    int S = ja.nextInt();
		    int A = ja.nextInt();
		    int B = ja.nextInt();
		    float C = ja.nextInt();
		    float p = S*(C/100);
		    float total = S + p;
		    if (total>=A && total<=B) System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}
