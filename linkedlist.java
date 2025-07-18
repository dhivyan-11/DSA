class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next=null;
    }
}

class SLL{
    Node head,tail;

    public void insertatend(int data){
        Node n1=new Node(data);

        if(head==null){
            head=n1;
            tail=n1;
        }
        else{
            tail.next=n1;
            tail=n1;
        }

    }
    public void insertatfirst(int data){
        Node n1=new Node(data);

        if(head==null){
            head=n1;
            tail=n1;
        }
        else{
            n1.next=head;
            head=n1;

        }

    }
    public void insertatspecific(int data,int pos){
        if(pos<=0){
            System.out.println("out of bond");  
            return;

        }
        if(pos==1){
            insertatfirst(data);
            return;

        }
        Node n1=new Node(data);
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        n1.next=temp.next;
        temp.next=n1;
    }
    public void deleteatEnd(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;

        }
        tail=temp;
        temp.next=null;
    }
    public void deleteatFirst(){
        Node temp=head;
        head=head.next;
        temp.next=null;
    }
    public void deleteatSpecific(int pos)
    {
        Node temp= head;
        for(int i=0;i<pos;i++){
                
        }

    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}

public class linkedlist{
    public static void main(String[] args) {
        SLL s=new SLL();
        s.insertatend(10);
        s.insertatend(15);
        s.insertatend(20);
        s.insertatfirst(2);
        s.insertatspecific(17,3);
        s.insertatspecific(17,0);
        s.insertatspecific(1,1);
        

        s.display();

    }
}