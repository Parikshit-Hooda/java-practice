/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		// Scanner sc = new Scanner(System.in);
		// final double SHORTPI = 31.14159;
		// System.out.println("Hello world");
		// int var1=100, var2;
		// System.out.println(var1);
		int minNum = 6, maxNum = 20;
		int randNum = minNum + (int)(Math.random() * ((maxNum-minNum)+1));
		System.out.println(randNum);
	}
}
