package Algorithms.Sorting;

public class QuickSort {
    public static void printArray(int[] intArray){
        for(int i: intArray){
            System.out.print(i + " ");
        }
    }
    public static int partition(int[] arr, int low, int high){

        int pivot=arr[(low+high)/2];
        while(low<=high){
            while(arr[low]<pivot){
                low++;
            }
            while(arr[high]>pivot){
                high--;
            }
            if(low<=high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;

                low++;
                high--;
            }
        }
        return low;
    }

    public static void quickSortRecursion(int[] arr,int low, int high){
        int pi=partition(arr,low,high);

        if(low<pi-1){
            quickSortRecursion(arr,low,pi-1);
        }
        if(pi<high){
            quickSortRecursion(arr,pi,high);
        }

    }

    public static void main(String[] args){
        int[] intArray={13,66,1,90,67,45,54,77};
        int length=intArray.length;
        //System.out.println("low: "+ partition(intArray, 0,length-1));
        quickSortRecursion(intArray,0,length-1);
        printArray(intArray);

    }
}
