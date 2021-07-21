package Algorithms.Recursion;

public class Factorial {
    //Using Recursion
public static int factorialUsingRecursion(int number){
    if(number<2){
        return 1;
    }else{
        return number*factorialUsingRecursion(number-1);
    }
}
    //Using loop
    public static int factorialUsingLoop(int num){
    int fact=1;
    if(num<2){
        return 1;
    }
    else{
        for(int i=2;i<=num;i++){//2<=4//3<=4//4<=4//5<=4 false;
            fact=fact*i; //fact=1*2=2// fact=2*3=6// fact=6*4=24;
        }
    }return fact;
}
public static void main(String[] args){
    System.out.println(factorialUsingRecursion(5));
    System.out.println(factorialUsingLoop(4));
}
}
