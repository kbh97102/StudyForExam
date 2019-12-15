package array;

import java.lang.reflect.Array;

public class DynamicArray<T>{
    private T[] dynamicArray;
    private int size;
    private int resizeDegree;
//    private Object[] arr;
    private int defaultSize = 10;
    private Class<T> type;

    @SuppressWarnings("unchecked")
    public DynamicArray(Class<T> type){
        this.type = type;
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
    @SuppressWarnings("unchecked")
    public void extend(){
//        T[] temp = dynamicArray;
        T[] temp = (T[])Array.newInstance(type,defaultSize);
        if (size >= 0) System.arraycopy(dynamicArray, 0, temp, 0, size);
        dynamicArray = (T[])Array.newInstance(type,size*2);
        if (size >= 0) System.arraycopy(temp, 0, dynamicArray, 0, size);
    }

    public void remove(int index){
        try{
            if(size > 0){
                for(int i=index;i<size-1;i++){
                    dynamicArray[i] = dynamicArray[i+1];
                }
                size--;
            }
        }catch(IndexOutOfBoundsException e1){
            System.out.println("Can't remove, No data in Array");
        }
    }
}
