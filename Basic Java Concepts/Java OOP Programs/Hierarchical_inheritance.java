/*

Hierarchical Inheritance:
1. In Hierarchical inheritance, one base class => many derived classes.
2. Which class object should we created in multilevel inheritance ? => create objects of each and every derived classes which is req. for accessing respective 
data member and member function of that respective classes.
*/
import java.util.Scanner;
class first{
	int a,b;
	void get_input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		a = sc.nextInt();
		System.out.println("Enter second Number: ");
		b = sc.nextInt();
	}
}
class addition extends first{
	void print_addition()
	{
		int ad = a+b;
		System.out.println("Addition is equal to: "+ ad);
	}
}
class subtraction extends first{
	void print_subtraction()
	{
		int sub = a-b;
		System.out.println("Subtraction is equal to: "+ sub);
	}
}

public class hierarchical_inheritance {

	public static void main(String[] args) {
		// Create object of each individual derived classes separately to access data member and member function.
		// object of first derived class: addition
		addition a = new addition();
		a.get_input();
		a.print_addition();
		
		// object of first derived class: addition
		subtraction b = new subtraction();
		b.get_input();
		b.print_subtraction();
	}

}
