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
}
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        linkedList list=new linkedList();
        list.addFirst(45);
        list.addFirst(67);
        list.addLast(98);
        list.addMiddle(56,1);
        list.print();
    }
}
