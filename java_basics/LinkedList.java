package java.java_basics;
class Node {
    int info;
    Node next;
}

class Operations {
    Node head;

    public void insert(int info) {
        Node node = new Node();
        node.info = info;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void insertAtFirst(int info) {
        Node node = new Node();
        node.info = info;
        node.next = null;

        node.next = head;
        head = node;
    }

    public void insertAt(int info, int previous) {
        Node node = new Node();
        node.info = info;
        // node.next = null;

        Node temp = head;
        while (temp.info != previous) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public void insertAtIndex(int index, int info) {
        Node node = new Node();
        node.info = info;
        // node.next = null;

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public void DeleteNode(int info){
        if(head == null)
         return; 
    
        if(head.info == info) {
            head = head.next; 
            return;
        }
    
        Node temp = head;
        while(temp.next != null) {
            if(temp.next.info == info) {
                if(temp.next.next == null) {
                    temp.next = null; 
                } else {
                    temp.next = temp.next.next;
                }
                return;
            }
            temp = temp.next;
        }
    }


    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.print(node.info + " ");
            node = node.next;
        }
        System.out.println(node.info);
    }
}

public class LinkedList {
    public static void main(String[] args) {
        Operations o1 = new Operations();

        o1.insert(1);
        o1.insert(18);
        o1.insert(27);
        o1.insert(9);
        o1.show();
        System.out.println("");

        o1.insertAtFirst(25);
        o1.show();
        o1.insertAt(19, 18);
        o1.show();
        o1.insertAtIndex(1, 4);
        o1.show();
        o1.DeleteNode(19);
        o1.show();
    }

}
