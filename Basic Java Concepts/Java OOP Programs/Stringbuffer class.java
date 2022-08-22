/*
Why to use StringBuffer class rather than String in java?
ans:
When we use string to create new string then the string becomes immutable.Any changes in it cannot affect original string.

When we use StringBuffer class to create new string then the string becomes mutable.Any changes in it can affect original string.

Some methods used in it:
1.setCharAt(index_of_string1,new_character to insert) :    To replace character at certain index in string and set new character.
2.append() : string1.append(string2)                  :    It will add one string to another string.
3.insert() : string1.insert(index_of_string1, string2) :    It will add some new string in between one string. string1.insert(index_of_string1, string2)
4.setLength():                                         :    Set new length to certain string with forward spaces.
*/


// 1.setCharAt(index_of_string1,new_character to insert) :    To replace character at certain index in string and set new character.
import java.util.Scanner;
class str{
	StringBuffer s = new StringBuffer("Margott");
	void set_char()
	{
		s.setCharAt(0, 'k');
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
		obj.set_char();
		obj.print();
	}
}
