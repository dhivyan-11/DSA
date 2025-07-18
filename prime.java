class Node
{
    int data;
    Node next;

    Node (int data)
    {
        this.data=data;
        this.next = null;
    }
}

class SingleLinkedList
{
    Node head, tail;

    public void InsertatEnd(int data)
    {
        Node n1 = new Node(data);

        if(head==null)
        {
            head = n1;
            tail = n1;
        }
        else
        {
            tail.next = n1;
            tail=n1;
        }
    }

    public void InsertatFirst(int data)
    {
        Node n1 = new Node(data);

        if(head==null)
        {
            head=n1;
            tail=n1;
        }
        else
        {
            n1.next=head;
            head=n1;
        }
    }

    public void InsertatSpecific(int data , int pos)
    {
        Node n2 =  new Node(data);

        Node temp = head;

        for(int i =0; i <pos-1; i++)
        {
            temp = temp.next;
        }

        n2.next=temp.next;
        temp.next=n2;
    }
    public void deleteatSpecific(int pos){
        Node temp = head;
       for(int i=0; i<pos-1;i++){

       temp=temp.next;}
       temp.next=temp.next.next;


    }
    
    public void deleteatfirststep(){
        Node temp= head;
        head = head.next;
        temp.next=null;
    }
    public void deleteatLast(){
        Node temp= head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        tail=temp;
        temp.next=null;
    }
    public void search(int data){
        Node temp=head;

        while(temp!=null){
             if(temp.data== data){
                System.out.println("found"+ data);
                break;
             
             }
             
            temp=temp.next;
           
        }
        System.out.println("not found");
    }

    public void display()
    {
        Node temp = head;

        while(temp!=null)
        {
            System.out.print(temp.data + "--> ");
            temp=temp.next;
        }
        System.out.println();
    }

}


public class LinkedList
{

    public static void main(String[] args) 
    {
        SingleLinkedList s1 = new SingleLinkedList();
        s1.InsertatEnd(10);
        s1.InsertatEnd(20);
        s1.InsertatEnd(30);
        s1.InsertatFirst(5);
        s1.InsertatSpecific(15, 2);
        
        s1.display();
        s1.deleteatfirststep();
        s1.display();
        s1.deleteatLast();
        s1.display();
        s1.deleteatSpecific(1);
       s1.display();
        s1.search(5);
    }
}
    // import java.util.Scanner;

    // class prime
    // {
    //     public static void main(String[] args) {
    //         Scanner s=new Scanner(System.in);
    //         System.out.println("enter the num");
    //         int num=s.nextInt();
    //         Boolean isPrime=true;  
    //         if (num <= 1) {
    //             isPrime = false;
    //         } else if (num == 2) {
    //             isPrime = true;
    //         } else if (num % 2 == 0) {
    //             isPrime = false;}
    //         else{
    //             for(int i=3;i*i<=num;i+=2){
                
    //                 if(num%i==0){
                    
    //                  isPrime=false;
    //              }
            
    //             }}
    //             if(isPrime){
    //                 System.out.println("prime");
    //             }
    //             else{
    //                 System.out.println("no");
    //             }

    //     }
    // }