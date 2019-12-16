package array;

import java.lang.reflect.Array;

public class DynamicArray<T>{
    private T[] dynamicArray;
    private int currentSize;
    private int resizeDegree;
//    private Object[] arr;
    private int defaultSize = 10;
    private int nodes;
    private Class<T> type;

    @SuppressWarnings("unchecked")
    public DynamicArray(Class<T> type){
        this.type = type;
        currentSize = defaultSize;
        resizeDegree = 2;
        nodes = 0;
//        arr = new Object[defaultSize];
        dynamicArray = (T[])Array.newInstance(type,defaultSize);
    }

    /**
     * If number of array bigger than currentArraySize, Extend
     * @param value == Input value
     */
    public void put(T value){
        if(nodes >= currentSize){
            extend();
        }
        dynamicArray[nodes++] = value;
    }

    /**
     * @param index == Find index
     * @return == Find Value
     */
    public T get(int index){
        return dynamicArray[index];
    }

    /**
     *
     * @return current Number of nodes
     */
    public int size(){
        return nodes;
    }

    /**
     * If array is fulled, Extends array and Input value
     */
    @SuppressWarnings("unchecked")
    public void extend(){
//        T[] temp = dynamicArray;
        try{
            currentSize = currentSize *2;
            T[] temp = (T[])Array.newInstance(type,currentSize);
            if (nodes >= 0) System.arraycopy(dynamicArray, 0, temp, 0, nodes);
//            if (currentSize >= 0) System.arraycopy(dynamicArray, 0, temp, 0, currentSize);
            dynamicArray = (T[])Array.newInstance(type, currentSize);
            if (nodes >= 0) System.arraycopy(temp, 0, dynamicArray, 0, nodes);
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

    /**
     *
     * @param data == Want to Find data
     * @return == If find return Data's index, else return -1
     */
    public int contains(T data){
        int index = -1;
        if(type != String.class){
            String arrayData;
            String compareData = data.toString();
            for(int i = 0; i< nodes; i++){
                arrayData = dynamicArray[i].toString();
                if(compareData.equals(arrayData)){
                    index = i;
                    break;
                }
            }
        }
        else{
            for(int i = 0; i< nodes; i++){
                if(data.equals(dynamicArray[i])){
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    /**
     * Find data's index First
     * @param data == Want to Remove data
     */
    public void remove(T data){
        try{
            if(nodes > 0){
                int index = contains(data);
                for(int i = index; i< nodes -1; i++){
                    dynamicArray[i] = dynamicArray[i+1];
                }
                nodes--;
            }
        }catch(IndexOutOfBoundsException e1){
            System.out.println("Can't remove, No data in Array");
        }
    }

    /**
     *
     * @param index == Want to Remove Data's index
     */
    public void remove(int index){
        try{
            if(nodes > 0){
                if (nodes - 1 - index >= 0)
                    System.arraycopy(dynamicArray, index + 1, dynamicArray, index, nodes - 1 - index);
                nodes--;
            }
        }catch(IndexOutOfBoundsException e1){
            System.out.println("Can't remove, No data in Array");
        }
    }

    //TODO check is Running and Improve performance
}
