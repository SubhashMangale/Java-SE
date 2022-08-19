/*
final variable:
If we declare one variable with final keyword we cannot change it's it value further in program means we cannot assign different value to the variable in program
otherwise it will show error.
*/


public class final_keyword {
	public static void main(String[] args)
	{
		int a = 5;
		final int b = 10; 
		a = 10;
//     b = 20; if we give such value then it will show error.
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}


/*
final method:
If base class and derived class consist of two methods which have same name then method overriding takes place means object executes method of derived class.
But suppose we have to execute base class method then what can we do?
Ans: Use final keyword before base class method so that if we going to use same name to another method in further program then it will show error and we have
to change the name of next method.
*/

class first{
	final void display()
	{
		System.out.println("Base class method!!!");
	}
}
class second extends first
{
	void display1()
	{
		System.out.println("Derived class method!!!");
	}
}
public class final_keyword {
	public static void main(String[] args)
	{
		second s = new second();
		s.display();
		s.display1();
	}
}

/*
final class: Don't worry about class :) :) => just use final keyword before class name
*/

final class first{
	final void display()
	{
		System.out.println("Base class method!!!");
	}
}
class second extends first
{
	void display1()
	{
		System.out.println("Derived class method!!!");
	}
}
public class final_keyword {
	public static void main(String[] args)
	{
		second s = new second();
		s.display();
		s.display1();
	}
}
