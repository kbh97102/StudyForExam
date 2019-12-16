import array.DynamicArray;

public class Main {
    public static void main(String[] args) {
        DynamicArray<Double> testArray = new DynamicArray<>(Double.class);
        System.out.println("Start");
        long startTime = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            testArray.put(i+0.5);
        }
//        for(int i=0;i<100000;i++){
//            System.out.print(testArray.get(i) + " ");
//            if (i % 10000 == 0) {
//                System.out.println();
//            }
//        }
        for(int i=0;i<100000;i++){
            testArray.remove(i);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("Running time : "+(endTime-startTime)/1000.0+"초");

    }
}
