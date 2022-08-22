// by using setLength() function we can set new length to original string.

import java.util.Scanner;
class str{
	StringBuffer s = new StringBuffer("Margott");
	void original_size()
	{
		System.out.println("Original size of string: "+s.length());
	}
	void modified_size()
	{
		s.setLength(10);
		System.out.println("Modified size of string: "+s.length());
	}
	
}
public class array {
	public static void main(String[] args)
	{
		
		str obj = new str();
		obj.original_size();
		obj.modified_size();
	}
}

/*
Output:
Original size of string: 7
Modified size of string: 10

*/
