import array.DynamicArray;

public class Main {
    public static void main(String[] args) {
        DynamicArray<Double> testArray = new DynamicArray<>(Double.class);
        for(int i=0;i<10;i++){
            testArray.put(i+0.5);
        }
        testArray.extend();
        System.out.println("size"+testArray.size());
        testArray.put(55.5);
        System.out.println("size"+testArray.size());
        for(int i=0;i<testArray.size();i++){
            System.out.println(testArray.get(i));
        }
        testArray.remove(2);


        for(int i=0;i<testArray.size();i++){
            System.out.println(testArray.get(i));
        }
    }
}
