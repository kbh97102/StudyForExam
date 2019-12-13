package test_1.createClass;

public class Class_1 {
    private String name;
    private int age;
    private boolean hasChild;
    public Class_1(String name, int age, boolean hasChild){
        this.name = name;
        this.age = age;
        this.hasChild = hasChild;
    }
    public Class_1(){
        name = "Defalut Name";
        age = 23;
        hasChild = false;
    }
}
