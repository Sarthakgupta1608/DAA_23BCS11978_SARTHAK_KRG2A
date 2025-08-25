// Node class for DLL
class DoublyNode {
    int data;
    DoublyNode prev, next;
    DoublyNode(int data) { this.data = data; }
}

// Doubly Linked List
class DoublyLinkedList {
    DoublyNode head;

    // Insert at beginning
    void insertAtBeginning(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    // Insert at end
    void insertAtEnd(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) { head = newNode; return; }
        DoublyNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete at beginning
    void deleteAtBeginning() {
        if (head == null) return;
        head = head.next;
        if (head != null) head.prev = null;
    }

    // Delete at end
    void deleteAtEnd() {
        if (head == null) return;
        if (head.next == null) { head = null; return; }
        DoublyNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.prev.next = null;
    }

    // Display
    void display() {
        DoublyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// Node class for Circular Linked List
class CircularNode {
    int data;
    CircularNode next;
    CircularNode(int data) { this.data = data; }
}

// Circular Linked List
class CircularLinkedList {
    CircularNode head = null;

    // Insert at beginning
    void insertAtBeginning(int data) {
        CircularNode newNode = new CircularNode(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            CircularNode temp = head;
            while (temp.next != head) temp = temp.next;
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    // Insert at end
    void insertAtEnd(int data) {
        CircularNode newNode = new CircularNode(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            CircularNode temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Delete at beginning
    void deleteAtBeginning() {
        if (head == null) return;
        if (head.next == head) { head = null; return; }
        CircularNode temp = head;
        while (temp.next != head) temp = temp.next;
        head = head.next;
        temp.next = head;
    }

    // Delete at end
    void deleteAtEnd() {
        if (head == null) return;
        if (head.next == head) { head = null; return; }
        CircularNode temp = head;
        CircularNode prev = null;
        while (temp.next != head) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = head;
    }

    // Display
    void display() {
        if (head == null) return;
        CircularNode temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

// Demo
public class experiment4code {
    public static void main(String[] args) {
        System.out.println("Doubly Linked List:");
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtBeginning(10);
        dll.insertAtEnd(20);
        dll.insertAtBeginning(5);
        dll.display();
        dll.deleteAtBeginning();
        dll.display();
        dll.deleteAtEnd();
        dll.display();

        System.out.println("\nCircular Linked List:");
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtBeginning(10);
        cll.insertAtEnd(20);
        cll.insertAtBeginning(5);
        cll.display();
        cll.deleteAtBeginning();
        cll.display();
        cll.deleteAtEnd();
        cll.display();
    }
}
