// insert() : string1.insert(index_of_string1, string2) :    It will add some new string in between one string in between any index or last , first
// any . string1.insert(index_of_string1, string2)

import java.util.Scanner;
class str{
	StringBuffer s = new StringBuffer("Margott");
	StringBuffer t = new StringBuffer("Robbie");
	void insertion()
	{
		s.insert(3,t);
	}
	void print()
	{
		System.out.println("string: "+s);
	}
	
}
public class array {
	public static void main(String[] args)
	{
		
		str obj = new str();
		obj.insertion();
		obj.print();
	}
}

/*
Output:
I have inserted second string at 3rd index of 1st string.
string: MarRobbiegott // Inseted Robbie at 3rd index of Margott.
*/
