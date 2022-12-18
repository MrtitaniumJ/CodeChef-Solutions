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
		    int dishes = ja.nextInt();
		    int fruits = ja.nextInt();
		    int vege = ja.nextInt();
		    int fishes = ja.nextInt();
		    if(vege >= dishes && (fruits+fishes) >= dishes) 
		        System.out.println("YES");
        else
            System.out.println("NO");
		}
	}
}
