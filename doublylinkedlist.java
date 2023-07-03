import java.util.Scanner;

public class doublylinkedlist {

    private static Node head;
    private static Node tail;
    private static int size;

    private static class Node {
        private int data;
        private Node prev;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void addElement(int element) {
        Node newNode = new Node(element);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    public static void removeElement(int element) {
        Node current = head;

        while (current != null) {
            if (current.data == element) {
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null;
                    }
                } else if (current == tail) {
                    tail = current.prev;
                    if (tail != null) {
                        tail.next = null;
                    } else {
                        head = null;
                    }
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }

                size--;
                System.out.println("Element removed from the list.");
                return;
            }

            current = current.next;
        }

        System.out.println("Element not found in the list.");
    }

    public static void displayList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        System.out.println("Current list elements:");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static int peekHead() {
        if (head != null) {
            return head.data;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Doubly Linked List Menu");
            System.out.println("1. Add an element");
            System.out.println("2. Remove an element");
            System.out.println("3. Display the list");
            System.out.println("4. Peek the head element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    int element = scanner.nextInt();
                    addElement(element);
                    System.out.println("Element added to the list.");
                    break;
                case 2:
                    System.out.print("Enter the element to remove: ");
                    int removeElement = scanner.nextInt();
                    removeElement(removeElement);
                    break;
                case 3:
                    displayList();
                    break;
                case 4:
                    int peekElement = peekHead();
                    if (peekElement != -1) {
                        System.out.println("Peek element: " + peekElement);
                    } else {
                        System.out.println("The list is empty.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        } while (choice != 5);

        scanner.close();
    }
}
