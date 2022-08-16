/*
Single Inheritance:

1. In single inheritance, just use "extends" keyword to inherite properties of base class in derived class.
2. Which class object should we create? => We have to create object of derived class.

*/
import java.util.*;
class A{
    int n,m;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();                     } // have taken input input in class A.
        m = sc.nextInt();                     }
    }
}
class B extends A{    // Inheritance creation.
    
    void print()
    {
    System.out.println("Addition of Inherited parameters is: "+(n+m));  // wihtout declaring this variable in derived class we have used them in derived class. 
    }
}
class HelloWorld {
    public static void main(String[] args) {
        //object created 
        B obj = new B();  // Create object of derived class.
            obj.input();  // access member function of base class with same object of class.
            obj.print();  // access member function of derived class.
    }
}
