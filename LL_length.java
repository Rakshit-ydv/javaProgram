class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
class linkedList{
    Node head;
    Node tail;
    
    public linkedList(){
        this.head=null;
        this.tail=null;
    }
    
    void addFirst(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }
    
    void print(){
        if(head==null){
            System.out.println("Linked list is empty..!!");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    
    void addLast(int data){
        Node newNode=new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        newNode.next=null;
        temp.next=newNode;
    }
    
    void addMiddle(int data,int Idx){
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<Idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    void length(){
        Node temp=head;
        int length=0;
        while(temp.next!=null){
            length+=1;
            temp=temp.next;
        }
        System.out.println("The length of your Linked list is "+length);
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        linkedList list=new linkedList();
        list.addFirst(45);
        list.print();
        list.length();
        System.out.println();
        
        list.addFirst(67);
        list.print();
        list.length();
        System.out.println();
        
        list.addLast(98);
        list.print();
        list.length();
        System.out.println();
        
        list.addMiddle(56,1);
        list.print();
        list.length();
        System.out.println();
    }
}
