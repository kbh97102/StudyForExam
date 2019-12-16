import stringHandling.StringHandler;

public class Main {
    public static void main(String[] args) {
        StringHandler handler = new StringHandler();
        String test1 = "test_isWork_go";
        String test2 = "test2IsComming";


        System.out.println(handler.replace(test1,'_','A'));
    }
}
