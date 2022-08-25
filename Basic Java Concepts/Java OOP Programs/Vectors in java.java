/*
1. What are vectors in java? 
ans: Vector is class in java and it is presented in java.util package.It is used to store objects of different types and size of any numbers. 

Vector in c++ are similar to Vectors in java means variable sized array.
Here 4 major functions are used:
1.addElement(item)
2.addElementAt(item,index at which item is to be inserted)
3.removeElement(item)
4.removeElementAt(index only)
5.ewmoveAllElements()
6.list.size() gives size of vector list.
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
        v.removeAllElements();
        System.out.println("Vector elements are"+v);
    }
}
/*
Output:
java -cp /tmp/JPPS6OVpcS HelloWorld
Vector elements are[Ramesh, Suresh, Mahesh, Sudesh]
Vector elements are[Ramesh, Suresh, Sandesh, Mahesh, Sudesh]
Vector elements are[Ramesh, Sandesh, Sudesh]
Vector elements are[]

*/
