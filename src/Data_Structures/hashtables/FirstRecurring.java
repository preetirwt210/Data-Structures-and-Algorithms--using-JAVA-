package Data_Structures.hashtables;

import java.util.HashSet;
import java.util.Set;

public class FirstRecurring {
    public  static Integer getFirstRecurring(int[] array){
        Set<Integer> hashSet=new HashSet<>();
        for(int element: array) { //1,2,4,3,4,6,8,5,6,8
            if(hashSet.contains(element)){
                return element;
//                System.out.println("already contains element " + element + " ");//4,6,8
            }
            else{
                hashSet.add(element);
                //System.out.println("New Elements added " + element + " ");//1,2,4,3,6,8,5
            }
        }
        return null;
       
    }
    public static void main(String[] args){
        int[] arr={1,2,4,3,4,6,8,5,6,8};

           System.out.println(getFirstRecurring(arr));
    }
}
