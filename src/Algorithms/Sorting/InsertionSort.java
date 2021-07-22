package Algorithms.Sorting;

public class InsertionSort {
    public static void insertionSort(int[] a){ //a={14,2,5,67,13,66,90};
        int temp,j;
        for(int i=1;i<a.length;i++){ // i=1;1<7
            temp=a[i];//temp=a[1]=2
            j=i; //j=1
            while(j>0&& a[j-1]>temp){ //1>0&& 14>2 true
                a[j]=a[j-1]; //a[1]=a[0]=> 2,14
                j=j-1;//j=0
            }
            a[j]=temp; //a[j]=2
        }
        for(int i=0;i<a.length;i++){
            System.out.print(" " + a[i]);
        }
    }

    public static void main(String[] args) {
        int[] a={14,2,5,67,13,66,90};
        insertionSort(a);

    }
}
