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
		    int add = A + B;
		    int stick = 0;
		    while(add>0){
		        int temp = add%10;
		        if(temp == 0 || temp == 6 || temp == 9) stick = stick + 6;
		        else if(temp == 1) stick = stick + 2;
		        else if(temp == 2 || temp == 3 || temp == 5) stick = stick + 5;
		        else if(temp == 4) stick = stick + 4;
		        else if(temp == 7) stick = stick + 3;
		        else if(temp == 8) stick = stick + 7;
		        add = add/10;
		    }
		    System.out.println(stick);
		}
	}
}
