/*
Multilevel Inheritance:
1. In Multilevel inheritance, just use "extends" keyword to inherite properties of base class in derived class as many as classes can be derived.
2. Which class object should we created in multilevel inheritance ? => We have to create object of final derived class.
*/
import java.util.Scanner;
class a{
    int n,m;
    void input1()
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();                      // have taken input input in class A.
        m = sc.nextInt();                     
    }
}
class b extends a{    // Inheritance creation.
    
   int x,y;
    void input2()
    {
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();                      // have taken input input in class A.
        y = sc.nextInt();                     
    }
}
class c extends b{
  int addition;
  void print()
  {
  addition = n+m+x+y;
  System.out.println("Addition: "+ addition);
  }
}
class multilevel_inheritance {
    public static void main(String[] args) {
        //object created 
        c obj = new c();   // Create object of derived class.
            obj.input1();  // access member function of base class with same object of class.
            obj.input2();  // access member function of derived class and base class for class C.
            obj.print();   // access member function of final derived class.
    }
}
