/*
1. What are vectors in java? 
ans: Vector is class in java and it is presented in java.util package.It is used to store objects of different types and size of any numbers. 

Vector in c++ are similar to Vectors in java means variable sized array.
*/

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("Ramesh");
        v.addElement("Suresh");
        v.addElement("Mahesh");
        v.addElement("Sudesh");
        System.out.println("Vector elements are"+v);
        v.insertElementAt("Sandesh",2);
        System.out.println();
        System.out.println("Vector elements are"+v);
    }
}
