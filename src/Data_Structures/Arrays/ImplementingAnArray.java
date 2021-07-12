package Data_Structures.Arrays;

import java.util.Arrays;

public class ImplementingAnArray {
  String[] array=new String[1];
 private int length=0;
 private int data;

 public ImplementingAnArray(){
     this.data=1;
 }
    public String get(int index){
     if(index>-1 && index<length){
         return this.array[index];
     }else{
         return "Index out of Bound";
     }
 }

    public void push(String item) {

        if (length == data) {
            String[] tempArray = new String[2 * data];
            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;
            data *= 2;
        }
        array[length] = item;
        length++;
    }

    public void replace(int index, String value) {
        if (index > -1 && index < length) {
            array[index] = value;
        } else
            System.out.println("Index out of bounds");
    }

    public void pop() {
        if (length > 0) {
            length--;
        }
    }

    public void delete(int index) {
        if (index > -1 && index < length) {
            if (index == length - 1) {
                pop();
            } else {
                for (int i = index; i < length; i++) {
                    array[i] = array[i + 1];
                }
                length--;
            }
        } else {
            System.out.println("Index out of bounds");
        }
    }

    public String[] getArray() {
        String[] tempArr = new String[length];
        for (int i = 0; i < length; i++) {
            tempArr[i] = array[i];
        }
        return tempArr;
    }

    public int length() {
        return length;
    }

    public static void main(String[] args){
        ImplementingAnArray dynamicArray=new ImplementingAnArray();
        dynamicArray.push("apple");
        dynamicArray.push("ball");
        dynamicArray.push("cat");
        dynamicArray.push("dog");
        System.out.println("Array-Length: " + dynamicArray.length());
        System.out.println("array: " + Arrays.toString(dynamicArray.getArray()));
        System.out.println("item at index 2: " + dynamicArray.get(2));
        dynamicArray.replace(1, "world");
        System.out.println("array: " + Arrays.toString(dynamicArray.getArray()));
        dynamicArray.pop();
        System.out.println("array: " + Arrays.toString(dynamicArray.getArray()));
        dynamicArray.delete(1);
        System.out.println("array: " + Arrays.toString(dynamicArray.getArray()));
        System.out.println("Array-Length: " + dynamicArray.length());
    }
//    public void print(){
//     for(int i=0;i<array.length;i++){
//         System.out.println("Array :" + array.toString());
//     }
//    }
}
