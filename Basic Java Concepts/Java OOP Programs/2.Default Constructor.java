/*
Why we use constructor? : what is it's need?
ans:
1.For the initialization of data members through object creation.
2.Rules : 
1] constructor name == its class name.
2] It must not have any return type(not even void also).
3] When object of that class is created constructor invoked automatically .
4] In short we use constructor, for intializing the value of variables which we will used in further calculation in java program.
*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class add{
    int a,b;
    add()
    {
        a = 100;
        b = 200;
    }
    void print()
    {
        System.out.println(a);
        System.out.print(b);
        
    }
}
class HelloWorld {
    public static void main(String[] args) {
        //object created 
        add aa = new add();
        aa.print();
    }
}
