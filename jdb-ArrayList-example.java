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
		ArrayList<String> aL1 = new ArrayList<String>(20);
		aL1.add("Mike");
		aL1.add("Susan");
		System.out.println(aL1.size());
		Iterator aL1itr = aL1.iterator();
		for(String x: aL1) System.out.println(x);
		ArrayList<Integer> aL2 = new ArrayList<Integer>(Arrays.asList(4,5,6,2));
		for(Integer x: aL2) System.out.println(x);
		System.out.println(aL2.get(1));
		aL2.set(1, 9);
		aL2.remove(0);
		for(Integer x: aL2) System.out.println(x);
		
		Iterator it = aL2.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
	}
}

//Output
/*
2
Mike
Susan
4
5
6
2
5
9
6
2
962
*/
