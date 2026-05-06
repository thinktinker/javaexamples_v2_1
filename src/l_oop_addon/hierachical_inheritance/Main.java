package l_oop_addon.hierachical_inheritance;

import l_oop_addon.hierachical_inheritance.model.Professor;
import l_oop_addon.hierachical_inheritance.model.Student;

public class Main {

    public static void main(String[] args) {

        Professor staff1 = new Professor("John", 50, "Math");
        staff1.setName("Dr. John Doe");
        staff1.setAge(51);

        staff1.displayProfessorInfo();

        Student student1 = new Student("Steve Smith", 20, "CS");
        student1.displayStudentInfo();

    }
}
