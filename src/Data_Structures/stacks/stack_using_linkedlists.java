package Data_Structures.stacks;

import java.util.Stack;

public class stack_using_linkedlists {
    private Node top;
    private Node bottom;
    private int length;

    public stack_using_linkedlists(){
        top=null;
        bottom=null;
        length=0;
    }
    public void push(String value){
       Node newNode=new Node(value);
       if(length==0){
           top=newNode;
           bottom=newNode;
           this.length++;
       }else{
           newNode.next=top;
           top=newNode;
           this.length++;
       }

    }
    public String peek(){
        if (length > 0) {
            return top.value;
        } else {
            return null;
        }
    }
    public void pop(){
        if (length > 0) {
            top = top.next;

            if (length == 1) {
                bottom = null;
            }
            length--;
        }
    }
    public int getLength(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public String getLastElement(){
        if (length > 0) {
            return bottom.value;
        }
        return null;
    }

    public static void main(String[] args){
        stack_using_linkedlists myStack = new stack_using_linkedlists();
        myStack.push("Google");
        myStack.push("Udemy");
        myStack.push("Discord");
        System.out.println(myStack.getLength());
        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.isEmpty());
        System.out.println(myStack.getLastElement());
    }
}
