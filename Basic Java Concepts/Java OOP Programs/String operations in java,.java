/*
How to declare strings in java? : String string_name = new String();

How to take input from user in string format? =  sc.next() or sc.nextLine();

*/

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class str{
    void take_single_word()
    {
    String name = new String();
    Scanner sc = new Scanner(System.in);
    name = sc.next();                   // for taking single word.
    System.out.println("Name :"+name);
    }
    void take_complete_line()
    {
    String name = new String();
    Scanner sc = new Scanner(System.in);
    name = sc.nextLine();             // for taking complete line.
    System.out.println("Name :"+name);
    }
}
class HelloWorld 
{
    public static void main(String[] args) 
    {
        System.out.println("Object created and accessed str method");
        str st = new str();
        st.take_single_word();
        st.take_complete_line();
    }
}

/*
Output:

java -cp /tmp/W8a6OyBDrk HelloWorld
Object created and accessed str method
Hello My name is Bradd.
Name :Hello
Hello My name is Angelina.
Name :Hello My name is Angelina.
*/



// toLowerCase : converts string into lowercase.
// toUpperCase : converts string into uppercase.
//charAt()
//length
