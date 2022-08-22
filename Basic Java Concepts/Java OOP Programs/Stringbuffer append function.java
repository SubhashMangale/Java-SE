// string1.append(string2)
//example:


import java.util.Scanner;
class str{
	StringBuffer s = new StringBuffer("Margott");
	StringBuffer t = new StringBuffer("Robbie");
	void appended()
	{
		s.append(t);
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
		obj.appended();
		obj.print();
	}
}
//Output:   string: MargottRobbie
