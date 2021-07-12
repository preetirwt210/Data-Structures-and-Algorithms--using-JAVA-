package Data_Structures.Arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static int[] mergeArray(int[] arr1,int[] arr2) {
        int i = 0, j = 0, k = 0;
        int mergedArrayLength=arr1.length +arr2.length;
        int[] mergedArray=new int[mergedArrayLength];

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] <arr2[j]){
                mergedArray[k]=arr1[i];
                i++;
            }else{
                mergedArray[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            mergedArray[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }
       return mergedArray;
    }
    public static void main(String[] args){
        int[] arr1={1,2,6,9,34,45};
     int[] arr2={3,4,8,33,66,67,80};
     System.out.println("Length of array1: " +arr1.length);
     System.out.println("Length of array2: " + arr2.length);
    int[] arr3= MergeSortedArrays.mergeArray(arr2,arr1);
     System.out.println("Length of array3: "+ arr3.length);
    System.out.println(Arrays.toString(arr3));
    }

}
