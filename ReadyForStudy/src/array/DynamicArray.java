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
        try{
            T[] temp = (T[])Array.newInstance(type,defaultSize);
            if (size >= 0) System.arraycopy(dynamicArray, 0, temp, 0, size);
            dynamicArray = (T[])Array.newInstance(type,size*2);
            if (size >= 0) System.arraycopy(temp, 0, dynamicArray, 0, size);
        }
        catch (IndexOutOfBoundsException e1){
            System.out.println("Index Error");
            e1.printStackTrace();
        }
        catch (ArrayStoreException e2){
            System.out.println("Type mismatch");
            e2.printStackTrace();
        }
        catch (NullPointerException e3){
            System.out.println("Friendly NullPointerException");
            e3.printStackTrace();
        }

    }
    public int contains(T data){
        int index = -1;
        if(type != String.class){
            String arrayData;
            String compareData = data.toString();
            for(int i=0;i<size;i++){
                arrayData = dynamicArray[i].toString();
                if(compareData.equals(arrayData)){
                    index = i;
                    break;
                }
            }
        }
        else{
            for(int i=0;i<size;i++){
                if(data.equals(dynamicArray[i])){
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
    public void remove(T data){
        try{
            if(size > 0){
                int index = contains(data);
                for(int i=index;i<size-1;i++){
                    dynamicArray[i] = dynamicArray[i+1];
                }
                size--;
            }
        }catch(IndexOutOfBoundsException e1){
            System.out.println("Can't remove, No data in Array");
        }
    }
    public void remove(int index){
        try{
            if(size > 0){
                if (size - 1 - index >= 0)
                    System.arraycopy(dynamicArray, index + 1, dynamicArray, index, size - 1 - index);
                size--;
            }
        }catch(IndexOutOfBoundsException e1){
            System.out.println("Can't remove, No data in Array");
        }
    }

    //TODO check is Running and Improve performance
}
