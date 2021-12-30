//https://ideone.com/TdslKN
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		LinkedList<Integer> lL1 = new LinkedList<Integer>();
 
		// Add value
		lL1.add(1); lL1.add(2); lL1.add(3);
 
		// Add array to list
		lL1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
 
		// Add to front (addLast Also)
		lL1.addFirst(0);
 
		// Check if in list
		System.out.println(lL1.contains(4)); //true
		System.out.println(lL1.contains(11)); //false
 
		// Get index for match
		System.out.println(lL1.indexOf(4)); //7
		System.out.println(lL1.indexOf(-1)); //-1
 
		// Replace
		lL1.set(0, 2);
 
		// Get value
		// Also getFirst, getLast
		System.out.println(lL1.get(0));
	//	System.out.println(lL1.get(15)); //runtime error
 
		// Delete (clear() removes all)
		lL1.remove(1);
 
		// Get size
		System.out.println(lL1.size());
 
		// Convert to array
		Object[] a9 = lL1.toArray();
		Iterator lL1itr = lL1.iterator();
		while(lL1itr.hasNext()) System.out.print(lL1itr.next() + " ");
	//	for(Interger x: a9) System.out.print(x + " ");
	}
}


//Output
/*
true
false
7
-1
2
12
2 2 3 1 2 3 4 5 6 7 8 9
*/
