#Design a stack which, in addition to push and pop has a function min which returns the minimum element?
import java.util.EmptyStackException;
public class Stack{
private static class StackNode{
    private int data;
    private StackNode next;
    public StackNode(int data){
        this.data=data;
    }
}
private StackNode top;
private int min_element;
void push(int item){
    StackNode t=new StackNode(item);
    t.next=top;
    top=t;
    
}
int pop(){
    if(top==null) throw new EmptyStackException();
    int item=top.data;
    
    top=top.next;
    return item;
}
int peek(){
    if(top==null) throw new EmptyStackException();
    return top.data;   
}
int min(){
    if(top==null) throw new EmptyStackException();
    else{
        
        min_element=top.data;
        StackNode temp;
        temp=top;
        while(temp!=null){
            if(temp.data<min_element)
            min_element=temp.data;
            temp=temp.next;
        }
    
    }
    return min_element;
}
public boolean isEmpty(){
    
        return top==null;
}

     public static void main(String []args){
         Stack ll=new Stack();
        ll.push(1);
         ll.push(2);
         ll.push(0);
    
        System.out.println(ll.min()); 
     }
}
