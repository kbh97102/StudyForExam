import test_1.Class_1;
import test_1.Class_2;
import test_1.Class_3;

public class Main {
    public static void main(String[] args) {
        Class_1.wakeup();
        Class_2.wakeup();
        Class_2 c2 = new Class_2("adsf", 123, false);
        Class_3 c3 = new Class_3();
        c2.interfaceTest1();
        c3.interfacetest2();
    }
}
