package Single;

public class Linkedlist {
    
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class SinglyLinkedList {
        Node head;

        // Method to insert a new node at the beginning
        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Method to insert a new node at a specific position
        public void insertAtPosition(int data, int position) {
            if (position == 0) {
                insertAtBeginning(data);
                return;
            }

            Node newNode = new Node(data);
            Node current = head;

            // Traverse to the position just before the desired position
            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.next;
            }

            if (current == null) {
                System.out.println("Position out of bounds");
                return;
            }

            newNode.next = current.next;
            current.next = newNode;
        }

        // Method to display the linked list
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Linkedlist linkedList = new Linkedlist(); // Create an instance of Linkedlist
        SinglyLinkedList list = linkedList.new SinglyLinkedList(); // Create an instance of SinglyLinkedList

        // Insert 777 at the beginning
        list.insertAtBeginning(777);

        // Insert initial values
        list.insertAtPosition(10, 1);
        list.insertAtPosition(20, 2);
        list.insertAtPosition(30, 3);
        list.insertAtPosition(40, 4);
        list.insertAtPosition(50, 5);
        list.insertAtPosition(60, 6);

        // Insert 333 at position 3
        list.insertAtPosition(333, 3);

        // Display the linked list
        list.display();  // Output: 777 10 20 333 30 40 50 60
    }
}