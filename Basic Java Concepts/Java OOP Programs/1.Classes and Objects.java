import java.util.*;
// this is declaration of class ( class class_name)
class example {
	void process(int n)
	{
		System.out.println("Square of number: "+n*n);
	}
}
public class classes_and_objects {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		//here object declaration 
		// class name object name  = new Keyword class_name();
		example e = new example();
		// why to use OOP instead of POP? why to do this long stuff?
		//According to me the main part is we can declare class and take as 
		//many different types of inputs in that class.
		//And using single object we can access that inputs , functions and so many things.
		
		//How to access data members/members function() using object?
		// object_name.data members 
		// object_name.member function
		e.process(m);
	}
}
