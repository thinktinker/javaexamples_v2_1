package l_oop_addon.hierachical_inheritance.model;

public class Professor extends Person{

    // properties
    String department;

    // constructor(s): parameterised constructor
    public Professor(String name, int age, String department){
        super(name, age);
        this.department = department;
    }

    // method(s)
    public void displayProfessorInfo(){
        super.displayInfo();
        System.out.println("Department: " + this.department);
    }
}
