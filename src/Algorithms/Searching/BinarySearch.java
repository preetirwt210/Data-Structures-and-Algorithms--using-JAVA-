package Algorithms.Searching;

public class BinarySearch {
    public static void search(int[] intArray){
        int search=8;
        int li=0;
        int hi=intArray.length-1;
        int mi=(li+hi)/2;
        int temp=0;

        while(li<=hi){
            if(intArray[mi]==search){
                System.out.println("Element found at : " + mi + " index position");
                temp+=1;
                break;
            }
            else if(intArray[mi]>=search){
                hi=mi-1;

            }
            else if(intArray[mi] <=search){
                li=mi+1;
            }
            mi=(li+hi)/2;
        }
        if(temp==0){
            System.out.println("No Such element found.");
        }
    }
    public static void main(String[] args){
        int[] intArray = {1,3,4,5,8,10,76,90};
        System.out.println("Binary Search: ");
        BinarySearch.search(intArray);
    }
}
