/*
Interfaces:
A interfaces is kind of class.It is class like structure which contains only Abstract methods and final fields.

1. Abstract Methods:Abstract methods/functions are such types of functions which do not contain curly braces or we can say that which do not implemented.
	e.g :void function();
	Q) So if we do not define abstract function inside interface then where it should be declared?
	ans: In the class which implement the interface.
  
2.final fields: I know that. once we declared one method as final we cannot declare method with same name in further program.	once we declare varible with final keyword 
then we cannot change it's value.

IMP Note: Concept of Multiple Inheritance can be implemented using Interface in java but it is not present in java directly.

//IMP
Why we use Interfaces in Java?
ans: We know that Java does not contain Multiple Inheritance. So To work like a Base Class in Java we use Interface in Java.
//IMP

//Syntax for implementing Interface with class 
interface interface_name
{
	#Abstract Methods.
	#Final methods.
}

//Syntax for implementing multiple inheritance/Interface with class.
class class_name implments interface_name
{
body of class
}

*/

interface area{
	public static final double pi = 3.14;
	double calculate(int x, int y);
}

class rectangle implements area  {
	public double calculate(int m,int n)
	{
		return m*n; 
	}
}

class circle implements area{
	
	public double calculate(int x, int y) {
		// TODO Auto-generated method stub
		return pi*x*x;
	}
}
public class Interfaces {
	public static void main(String[] args)
	{
		rectangle rec = new rectangle();
		circle c  = new circle();
		area a;
		
		//To access first class
		a = rec;
		System.out.println("Area of Rectangle: "+a.calculate(10, 20));
		
		a = c;
		System.out.println("Area of Circle of radius 5 is: "+c.calculate(5,5));
		
	}
}

/*
Output:
Area of Rectangle: 200.0
Area of Circle of radius 5 is: 78.5
*/
