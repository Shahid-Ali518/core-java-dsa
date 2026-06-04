class Node{
    int data;
    Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public Node(int newData){
        this.data = newData;
        this.next = null;
    }

}

public class SinglyLinkedList {

    public static void traversedList(Node head){
        Node current = head;
        if(current == null)
            System.out.println("List is Empty");

        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // insert node at start
    public static Node insertAtStart(Node head, int data){

        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    // insert node at end
    public static Node insertAtEnd(Node head, int data){

        Node newNode = new Node(data);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;

        return head;
    }

    // insert node at after a given node
    public static Node insertAfterGivenNode(Node head, int data, int key){

        Node newNode = new Node(data);
        Node current = head;

        while(current != null){
            if(current.data == key){
                break;
            }
            current = current.next;
        }
        if(current == null){
            System.out.println("Node not found");
            return head;
        }


        newNode.next = current.next;
        current.next = newNode;
        return head;
    }


    // insert node at before a given node
    public static Node insertBeforeGivenNode(Node head, int data, int key){

        Node newNode = new Node(data);
        Node current = head;
        Node prev = null;


        while(current != null){
            if(current.data == key){
                break;
            }
            prev = current;
            current = current.next;
        }
        if(current == null){
            System.out.println("Node not found");
            return head;
        }


        prev.next = newNode;

        newNode.next = current;
        return head;

    }
    // method to delete the node from start
    public static Node deleteFromFront(Node head){

        if(head == null){
            System.out.println("List is empty");
            return head;
        }
        Node temp = head;
        head = head.next;
        temp = null;
        return head;
    }

    // method to delete the node from end
    public static Node deleteFromEnd(Node head){

        if(head == null){
            System.out.println("List is empty");
            return head;
        }
        Node current = head;
        Node prev = null;
        while(current.next != null){
            prev = current;
            current = current.next;
        }

        prev.next = null;

        return head;
    }

    // method to delete the node from end
    public static Node deleteFromSpecificPosition(Node head, int key){

        if(head == null){
            System.out.println("List is empty");
            return head;
        }
        Node current = head;
        Node prev = null;
        while(current.next != null){
            prev = current;
            if(current.data == key)
                break;
            current = current.next;
        }

        if(current.next == null)
            System.out.println("node not found");
        else{

            prev.next = current.next;

        }
        return head;
    }


    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node head1 = new Node(15);
        head1.next = new Node(25);
        head1.next.next = new Node(35);
        head1.next.next.next = new Node(45);
        head1.next.next.next.next = new Node(55);
        head1 = insertAtEnd(head, -22);

//        traversedList(head);
//
//        head = insertAtStart(head, 1);
//
//        traversedList(head);
//
//        head = insertAtEnd(head, -22);
//
//        traversedList(head);
//
//        head = insertAfterGivenNode(head, 0, 20);
//
//        traversedList(head);
//
//        head = insertBeforeGivenNode(head, 9, 10);
//
//        traversedList(head);

//        traversedList(head);
//        head = deleteFromFront(head);
////        head = deleteFromFront(head);
//        traversedList(head);
//
////        head = deleteFromEnd(head);
//        head = deleteFromEnd(head);
//        traversedList(head);
//
//        head = deleteFromSpecificPosition(head, 20);
//        traversedList(head);

//        Node list = merge(head, head1);

//        traversedList(list);

    }

}
