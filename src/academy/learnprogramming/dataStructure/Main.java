package academy.learnprogramming.dataStructure;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//      int length=  "bksabdkbbkzxbkbadsjdj".length();
//        System.out.println(length);
//     String[] nemo={"nemo"};
////        String[] all={"preeti", "sneha", "keerti","priya","spriya", "nemo","hello","happy","supriya"};
//	find.findNemo(nemo);

//
//       ImplementingAnArray dynamicArray=new ImplementingAnArray();
//        dynamicArray.push("apple");
//        dynamicArray.push("ball");
//        dynamicArray.push("cat");
//        dynamicArray.push("dog");
//        System.out.println("Array-Length: " + dynamicArray.length());
//        System.out.println("array: " + Arrays.toString(dynamicArray.getArray()));
//        System.out.println("item at index 2: " + dynamicArray.get(2));
//        dynamicArray.replace(1, "world");
//        System.out.println("array: " + Arrays.toString(dynamicArray.getArray()));
//        dynamicArray.pop();
//        System.out.println("array: " + Arrays.toString(dynamicArray.getArray()));
//        dynamicArray.delete(1);
//        System.out.println("array: " + Arrays.toString(dynamicArray.getArray()));
//        System.out.println("Array-Length: " + dynamicArray.length());

//           System.out.println("Reverse String #1 : "+ReverseString.reverse1("Preeti Rawat"));
//     System.out.println("Reverse String #2: "+ReverseString.reverse2("kavita"));

     int[] arr1={1,2,6,9,34,45};
     int[] arr2={3,4,8,33,66,67,80};
     System.out.println("Length of array1: " +arr1.length);
     System.out.println("Length of array2: " + arr2.length);
    int[] arr3=MergeSortedArrays.mergeArray(arr2,arr1);
     System.out.println("Length of array3: "+ arr3.length);
    System.out.println(Arrays.toString(arr3));
    }
}
