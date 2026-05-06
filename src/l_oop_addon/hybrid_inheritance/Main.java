package l_oop_addon.hybrid_inheritance;

public class Main {

    public static void main(String[] args) {

        Human human1 = new Human();

        human1.displayChild();      // invoking the method that belongs to Human class
        human1.show();              // invoking the method based on the method signature of the Male and Female interface
        human1.displayHumanBody();  // invoking the method that comes from the parent class (HumanBody)

    }

}
