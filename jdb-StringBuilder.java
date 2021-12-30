/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		StringBuilder sb = new StringBuilder("Hello, world!");
		System.out.println(sb);
		System.out.println(sb.length()); //length of curr stringbuilder var
		System.out.println(sb.capacity()); //capacity. capacity may not equals to length
		System.out.println(sb.append(" What's up everybody?"));
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.insert(6, " there"));
		System.out.println(sb);
		System.out.println(sb.replace(6,12, "here"));
		System.out.println(sb);
		System.out.println(sb.substring(1,5));
		System.out.println(sb.delete(1,5));
		System.out.println(sb.charAt(4));
		System.out.println(sb.indexOf("here"));
		
	}
}

//Output
/*
Hello, world!
13
29
Hello, world! What's up everybody?
34
60
Hello, there world! What's up everybody?
Hello, there world! What's up everybody?
Hello,here world! What's up everybody?
Hello,here world! What's up everybody?
ello
H,here world! What's up everybody?
r
2
*/
