package l_oop_addon.hybrid_inheritance;

public class Human extends HumanBody implements Male, Female{
    @Override
    public void show() {
        System.out.println("Implementation of show() method defined in interfaces Male and Female.");
    }

    public void displayChild(){
        System.out.println("Method defined in the Child class (Human)");
    }
}
