package n1;

public class Test {
    public static void main(String[] args) {
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        System.out.println("Element: " + ArrayQueueModule.element()); // Ожидается 1
        System.out.println("Dequeued: " + ArrayQueueModule.dequeue()); // Ожидается 1
        System.out.println("Element: " + ArrayQueueModule.element()); // Ожидается 1
        System.out.println("Size: " + ArrayQueueModule.size());
        System.out.println("Is Empty: " + ArrayQueueModule.isEmpty());
        ArrayQueueModule.clear();
        System.out.println("Is Empty: " + ArrayQueueModule.isEmpty());
        System.out.println();


        // Тесты для ArrayQueueADT
        ArrayQueueADT queue = ArrayQueueADT.create();
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("Element: " + queue.element()); // Ожидается 3
        System.out.println("Dequeued: " + queue.dequeue()); // Ожидается 3
        System.out.println("Element: " + queue.element()); // Ожидается 3
        System.out.println("Size: " + queue.size()); // Ожидается 1
        System.out.println("Is Empty: " + queue.isEmpty()); // Ожидается false
        queue.clear();
        System.out.println("Is Empty: " + queue.isEmpty()); // Ожидается true
        System.out.println();


        // Тесты для ArrayQueue
        ArrayQueue queueClass = new ArrayQueue();
        queueClass.enqueue(5);
        queueClass.enqueue(6);
        System.out.println("Element: " + queueClass.element()); // Ожидается 5
        System.out.println("Dequeued: " + queueClass.dequeue()); // Ожидается 5
        System.out.println("Element: " + queueClass.element()); // Ожидается 5
        System.out.println("Size: " + queueClass.size()); // Ожидается 1
        System.out.println("Is Empty: " + queueClass.isEmpty()); // Ожидается false
        queueClass.clear();
        System.out.println("Is Empty: " + queueClass.isEmpty()); // Ожидается true
    }
}
