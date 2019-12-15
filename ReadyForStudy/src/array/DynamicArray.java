package array;

import java.lang.reflect.Array;

public class DynamicArray<T>{
    private T[] dynamicArray;
    private int size;
    private int resizeDegree;
//    private Object[] arr;
    private int defaultSize = 10;


    @SuppressWarnings("unchecked")
    public DynamicArray(Class<T> type){
        size = 0;
        resizeDegree = 2;
//        arr = new Object[defaultSize];
        dynamicArray = (T[])Array.newInstance(type,defaultSize);
    }
    public void put(T value){
        dynamicArray[size++] = value;
    }

    public T get(int index){
        return dynamicArray[index];
    }
    public int size(){
        return size;
    }
}
