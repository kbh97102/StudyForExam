package test_1;

public class Class_2 extends Class_1 implements Interface_1{


    public Class_2(String name, int age, boolean hasChild) {
        super(name, age, hasChild);
    }

    public static void wakeup(){
        System.out.println("already wake up");
    }

    @Override
    public void check1RM() {
        System.out.println("3대 500");
    }

    @Override
    public void dateWithLover() {
        System.out.println("NullPointerException");
    }

    @Override
    public void interfaceTest1() {
        System.out.println("Override InterfaceMethod");
    }
}
