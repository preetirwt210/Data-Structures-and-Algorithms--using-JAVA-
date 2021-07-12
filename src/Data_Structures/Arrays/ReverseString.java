package Data_Structures.Arrays;

public class ReverseString {
    //first reverse method
    public static String reverse1(String str) {
        String temp = "";
        for (int i =str.length()-1;i>=0;i--){
            temp+=str.charAt(i);
        }
        return temp;
    }
    //second reverse method
    public static String reverse2(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args){
        System.out.println("Reverse String #1 : "+ReverseString.reverse1("Preeti Rawat"));
        System.out.println("Reverse String #2: "+ReverseString.reverse2("kavita"));

    }
}
