package l_oop_addon.hierachical_inheritance.model;

public class Person {

    // properties
    String name;                                    // package-private property
    int age;                                        // package-private property

    // constructor(s)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // method(s)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void displayInfo(){                             // package private method
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

}
