package Algorithms.Recursion;


public class Fibonacci {
    static int n1=0,n2=1,n3;
    //Using recursion
    public static void fibonacciSeriesUsingRecusrion(int count){

        if(count>0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+ n3);
            fibonacciSeriesUsingRecusrion(count - 1);
        }

    }
//using loop
    public static void fibonacciSeriesUsingLoop(int count){
        System.out.println();
        int n1=0,n2=1,n3;
        if(count>0){
            for (int i=1;i<count;i++){
                n3=n1+n2;
                n1=n2;
                n2=n3;
                System.out.print(" "+ n3);
            }
        }
    }
    public static void main(String[] args){

        fibonacciSeriesUsingRecusrion(10 );
        fibonacciSeriesUsingLoop(10 );
    }
}
