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
		StringBuilder sb = new StringBuilder();
		while(T-->0){
		    int a = ja.nextInt();
		    int b = ja.nextInt();
		    int c = ja.nextInt();
		    int d = ja.nextInt();
		    int k = ja.nextInt();
		    int absolute = Math.abs(a-c)+Math.abs(b-d);
		    if(absolute>k)
		        sb.append("NO");
		    else{
		        if(absolute%2==0 && k%2==0) sb.append("YES");
		        else if(absolute%2==1 && k%2==1) sb.append("YES");
		        else sb.append("NO");
		    }
		    sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
