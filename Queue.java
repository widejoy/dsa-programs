import java.util.Scanner;

public class Queue {
    private int[] array;
    private int front;
    private int rear;
    private int capacity;

    public Queue(int size) {
        capacity = size;
        array = new int[capacity];
        front = 0;
        rear = -1;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue element.");
            return;
        }
        rear = (rear + 1) % capacity;
        array[rear] = item;
        System.out.println("Enqueued element: " + item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        }
        int dequeuedItem = array[front];
        front = (front + 1) % capacity;
        return dequeuedItem;
    }

    public boolean isEmpty() {
        return (rear == -1);
    }

    public boolean isFull() {
        return ((rear + 1) % capacity == front);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();
        Queue queue = new Queue(size);

        int choice = 0;
        while (choice != 4) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int element = scanner.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    int dequeuedElement = queue.dequeue();
                    if (dequeuedElement != -1) {
                        System.out.println("Dequeued element: " + dequeuedElement);
                    }
                    break;
                case 3:
                    System.out.print("Queue: ");
                    if (queue.isEmpty()) {
                        System.out.println("Empty");
                    } else {
                        int current = queue.front;
                        while (current != queue.rear) {
                            System.out.print(queue.array[current] + " ");
                            current = (current + 1) % queue.capacity;
                        }
                        System.out.println(queue.array[current]);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
