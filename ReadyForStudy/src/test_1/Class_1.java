package test_1;

public abstract class Class_1 {
    private static String job;
    private static String nationality;
    private static String sex;
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
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public static void sleeping(){
        System.out.println("zzz...");
    }
    public static void wakeup(){
        System.out.println("Plz give me a 5 minute");
    }
    abstract public void check1RM();
    abstract public void dateWithLover();
}
