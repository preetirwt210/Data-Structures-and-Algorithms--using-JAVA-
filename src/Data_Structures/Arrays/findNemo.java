package Data_Structures.Arrays;

public class findNemo {
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
    public static void main(String[] args){
            int length=  "bksabdkbbkzxbkbadsjdj".length();
            System.out.println(length);
           String[] nemo={"nemo"};
           String[] all={"preeti", "sneha", "keerti","priya","spriya", "nemo","hello","happy","supriya"};
           findNemo(nemo);
    }
}
