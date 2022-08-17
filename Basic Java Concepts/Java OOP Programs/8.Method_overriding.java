/*
What is method overriding:
Ans:
    1] If base class and derived class contain same named function and we call the function using object then which function will executed?
    ans: Derived class function will be executed. Here function in the derived class 'overrides' the function in base class hence it called as method overriding.
    
*/

import java.util.*;
class A{
  int a,b;
  void input()
  {
      try (Scanner sc = new Scanner(System.in)) {
		a = sc.nextInt();
		  b = sc.nextInt();
	}
  }
  void a()
  {
      int ans = a+b;
      System.out.println("Ans: "+ans);
  }
}
class B extends A{
  void a()
  {
      int ans = a*b;
      System.out.println("Ans: "+ans);
  }
}
class method_overriding{
	public static void main(String[] args)
	{
		B obj = new B();
		obj.input();
		obj.a();
	}
}

/*
Output:
10
20
Ans: 200
here the function of derived class in executed and this is called as function/method overriding.
*/
