public class Linkedlist{
    Node head;
    public class Node{
    Node next;
    int data;
    public Node(int data){
        this.data=data;
        
    }
    }
    void append(int data){
        
        if(head==null){
            head=new Node(data);
            head.next=null;
            System.out.println(head.data);
            return;
        }
        Node current =head;
        
        while(current.next!=null){
            
            current=current.next;
        }
        current.next=new Node(data);
        
    }
   void delete(int data){
        if(head!=null){
            return;
        }
        Node current =head;
        while(current.next!=null){
            
            if(current.next.data==data){
                
            current.next=current.next.next;
        }
        current=current.next;
        }
        
        
    }
    
    public static void main(String[] args){
       
        Linkedlist obj=new Linkedlist();
        
        //call operations here.
        
    }
    
}
