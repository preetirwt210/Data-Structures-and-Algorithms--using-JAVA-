package academy.learnprogramming.dataStructure;

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

}
