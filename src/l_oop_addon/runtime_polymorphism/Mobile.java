package l_oop_addon.runtime_polymorphism;

class Mobile{
    void sms(){
        System.out.println("Mobile class");
    }

}

class OnePlus extends Mobile {
    @Override                                   // Use the annotation @Override to indicate
    void sms() {                                // that we are overriding a parent class method
        System.out.println("OnePlus class");
    }
}

class Main{
    public static void main(String[] args) {
        OnePlus onePlusPhone = new OnePlus();
        onePlusPhone.sms();                     // child's class method sms() is invoked
    }
}