package l_oop_addon.hierachical_inheritance.model;

/*
 * Complete the constructor and displayStudentInfo()
 * by updating the major property in the correct places.
 */
public class Student extends Person {

    // properties
    String major;

    // constructor(s)
    public Student(String name, int age, String major){
        super(name, age);
        this.major = major;
    }

    // method(s)
    public void displayStudentInfo(){
        super.displayInfo();
        System.out.println("Major: " + this.major);
    }
}
