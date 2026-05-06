package l_oop_addon.multlevel_inheritance;

class GrandParent{
    public GrandParent(){
        System.out.println("GrandParent constructor called by Child’s default constructor");
    }
}
class Parent extends GrandParent {
    public Parent(){
        System.out.println("Parent constructor called by Child's default constructor");
    }
}
class Child extends Parent {
    // The default constructor invokes both Parent and GrandParent constructor
    // default constructor is invisible
}

public class Main{
    public static void main(String args[]) {

        // through multi-level inheritance
        Child childInstance = new Child();
    }
}