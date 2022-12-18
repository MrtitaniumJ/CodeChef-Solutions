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
		    int X = ja.nextInt();
		    int max = 0;
		    for(int i = 1; i <= N; i++){
		        int Si = ja.nextInt();
		        int Ri = ja.nextInt();
		        if(Si <= X){
		            max = Math.max(max,Ri);
		        }
		    }
		    System.out.println(max);
		}
	}
}
