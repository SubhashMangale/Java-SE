/*
1. What are vectors in java? 
ans: Vector is class in java and it is presented in java.util package.It is used to store objects of different types and size of any numbers. 

Vector in c++ are similar to Vectors in java means variable sized array.
Here 4 major functions are used:
addElement(item)
addElementAt(item,index at which item is to be inserted)
removeElement(item)
removeElementAt(index only)
*/

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
        v.removeElement("Mahesh");
        v.removeElementAt(1);
        System.out.println("Vector elements are"+v);
    }
}
