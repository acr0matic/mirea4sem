package mirea.isbo1016.queue;

import mirea.isbo1016.queue.array.ArrayQueue;
import mirea.isbo1016.queue.array.ArrayQueueADT;
import mirea.isbo1016.queue.linked.LinkedQueue;

public class QueueTest {
    public static void main(String[] args) {
        ArrayQueueADT queueADT = new ArrayQueueADT(15);
        LinkedQueue linkedQueue = new LinkedQueue();

        for (int i = 0; i < 10; i++) //Заполняем очередь 10 элементами
            ArrayQueue.add(queueADT, i);

        // Вызываем все методы для проверки очереди как абстрактный тип данных и класса
        // оболочки для работы с ней
        // В качестве аргумента используем экземляр абстрактного типа данных - очередь
        System.out.println("\n---------Array Queue----------");
        ArrayQueue.displayElements(queueADT);
        ArrayQueue.checkFill(queueADT);

        ArrayQueue.remove(queueADT);
        ArrayQueue.displayElements(queueADT);
        ArrayQueue.checkFill(queueADT);

        ArrayQueue.add(queueADT, 55);
        ArrayQueue.displayElements(queueADT);
        ArrayQueue.checkFill(queueADT);

        ArrayQueue.getFirstElement(queueADT);
        ArrayQueue.getLastElement(queueADT);

        ArrayQueue.removeAll(queueADT);
        ArrayQueue.displayElements(queueADT);
        ArrayQueue.checkFill(queueADT);
        System.out.println("\n ---------Linked Queue--------- \n");

        linkedQueue.enqueue(3);
        linkedQueue.enqueue("dssd");
        linkedQueue.enqueue(2.4);
        linkedQueue.displayElements();
        linkedQueue.dequeue();
        linkedQueue.dequeue();
        linkedQueue.displayElements();
        linkedQueue.dequeue();
        linkedQueue.displayElements();

    }
}
