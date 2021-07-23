package Algorithms.Searching;

public class LinearSearch {
    public static void search(int[] intArray){
        int search=1;
        int temp =0;
        for(int i=0; i<intArray.length;i++){
            if(intArray[i]==search){
                System.out.println(" Element found at: " + i + " index position.");
                temp=1;
            }
        }
        if(temp==0){
            System.out.println("No such element found.");
        }
    }
    public static void main(String[] args){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println("Linear Search: ");
        LinearSearch.search(intArray);

    }
}
