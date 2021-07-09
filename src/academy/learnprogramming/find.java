package academy.learnprogramming;

public class find {
    public static void findNemo(String[] arr){
        long t0=System.currentTimeMillis();
        System.out.println(t0);
        for(int i=0;i<arr.length;i++){
            if(arr[i]=="nemo"){
                System.out.println("Found Nemo..!");
            }
            else{
                System.out.println("Invalid String: Not Found.");
            }
            long t1=System.currentTimeMillis();
            System.out.println(t1);
            System.out.println("Total execution time difference is: "+ (t1-t0) + "miliseconds");
        }
    }
}
