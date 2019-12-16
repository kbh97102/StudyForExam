package stringHandling;

import java.util.Arrays;

//TODO split, replace , concatenate
public class StringHandler {

    private String inputString;
    private char splitStandard;

    public StringHandler(){
    }

    /**
     *After split save in array, so we need arraySize
     * @return arraySize
     */
    public int getSize(){
        int indexs=0;
        for(int i = 0; i< inputString.length(); i++){
            if(inputString.charAt(i) == splitStandard){
                indexs++;
            }
        }
        return indexs+1;
    }

    /**
     *
     * @param input == String to split
     * @param splitStandard == Standard to split
     * @return == splited String in array
     */
    public String[] split(String input, char splitStandard){
        this.inputString = input;
        this.splitStandard = splitStandard;
        int maxSize = getSize();
        int startIndex = 0;
        int endIndex = 0;
        int count = 0;
        String[] splited = new String[maxSize];

        for(int i=0;i<inputString.length();i++){
            if(maxSize-1 == count){
                splited[count] = inputString.substring(startIndex,inputString.length());
                break;
            }
            if(inputString.charAt(i) == splitStandard){
                endIndex = i;
                splited[count++] = inputString.substring(startIndex,endIndex);
                startIndex = i+1;
            }
        }
        return splited;
    }

    /**
     *
     * @param input == String that want to replace
     * @param srcData == Data that want to replace
     * @param desData == Data that want to replace to this
     * @return == replaced String
     */
    public String replace(String input, char srcData, char desData){
        this.inputString = input;
        char[] oldString = new char[inputString.length()];
        for(int i=0;i<inputString.length();i++){
            oldString[i] = inputString.charAt(i);
        }
        for(int i=0;i<oldString.length;i++){
            if(oldString[i] == srcData){
                oldString[i] = desData;
            }
        }
        return new String(oldString);
    }

    public String concatenate(String srcString, String desString){
        return srcString+desString;
    }
}
