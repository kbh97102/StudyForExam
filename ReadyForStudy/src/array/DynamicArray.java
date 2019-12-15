package array;

import java.lang.reflect.Array;

public class DynamicArray<T>{
    private T[] dynamicArray;
    private int size;
    private int resizeDegree;
    private Object[] arr;
    private int defaultSize = 10;

    public DynamicArray(){
        size = 0;
        resizeDegree = 2;
        arr = new Object[defaultSize];
    }
    public void put(T value){
        arr[size++] = value;
    }

}
