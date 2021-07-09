package academy.learnprogramming;

public class find {
    public static void findNemo(String[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]=="nemo"){
                System.out.println("Found Nemo..!");
            }
            else{
                System.out.println("Invalid String: Not Found.");
            }
        }
    }
}
