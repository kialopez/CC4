import java.util.*;

public class StackQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose data structure:\n1. Stack\n2. Queue\nEnter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the upper bound for the stack: ");
                int stackUpperBound = scanner.nextInt();
                stackProgram(stackUpperBound, scanner);
                break;
            case 2:
                System.out.print("Enter the upper bound for the queue: ");
                int queueUpperBound = scanner.nextInt();
                queueProgram(queueUpperBound, scanner);
                break;
            default:
                System.out.println("Invalid choice. Please enter either '1' for stack or '2' for queue.");
        }
    }

    public static void stackProgram(int upperBound, Scanner scanner) {
        Deque<Object> stack = new ArrayDeque<>();
        while (true) {
            System.out.print("\n1. Push\n2. Pop\n3. Finish\nEnter your choice: ");
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    if (stack.size() < upperBound) {
                        pushToStack(stack, scanner);
                    } else {
                        System.out.println("Stack is full.");
                    }
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        System.out.println("Popped " + stack.pop() + " from the stack");
                    } else {
                        System.out.println("Stack is empty");
                    }
                    break;
                case 3:
                    System.out.println("Final stack: " + stack);
                    return;
                default:
                    System.out.println("Invalid choice. Please enter '1', '2', or '3'.");
            }
        }
    }

    public static void pushToStack(Deque<Object> stack, Scanner scanner) {
        while (true) {
            try {
                System.out.print("Enter the item to push into the stack: ");
                String item = scanner.next();
                stack.push(item);
                System.out.println("Pushed \"" + item + "\" into the stack.");
                return;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type.");
                scanner.next(); // Clear the invalid input
            }
        }
    }

    public static void queueProgram(int upperBound, Scanner scanner) {
        Queue<Object> queue = new LinkedList<>();
        while (true) {
            System.out.print("\n1. Enqueue\n2. Dequeue\n3. Finish\nEnter your choice: ");
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    if (queue.size() < upperBound) {
                        enqueueToQueue(queue, scanner);
                    } else {
                        System.out.println("Queue is full.");
                    }
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        System.out.println("Dequeued " + queue.remove() + " from the queue");
                    } else {
                        System.out.println("Queue is empty");
                    }
                    break;
                case 3:
                    System.out.println("Final queue: " + queue);
                    return;
                default:
                    System.out.println("Invalid choice. Please enter '1', '2', or '3'.");
            }
        }
    }

    public static void enqueueToQueue(Queue<Object> queue, Scanner scanner) {
        while (true) {
            try {
                System.out.print("Enter the item to enqueue into the queue: ");
                String item = scanner.next();
                queue.add(item);
                System.out.println("Enqueued \"" + item + "\" into the queue");
                return;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type.");
                scanner.next(); // Clear the invalid input
            }
        }
    }
}
