
package mirea.isbo1016.queue.array;

public class ArrayQueue{

//    Набор основных методов для работы с очередью на базе массива
//    - elementsCount - Вернуть количество элементов в очереди
//    - checkFill - проверить заполненность очереди
//    - add - добавить элемент
//    - remove - удалить элемент
//    - removeAll - удалить все элементы
//    - displayElements - показать элементы в очереди
//    - getFirstElement - получить первый элемент
//    - getLastElement - получить последний элемент

//    Получаем информацию о заполненности в виде строки
    public static void checkFill(ArrayQueueADT queue) {
        if (queue.getMaxQueueSize() == queue.getElementsCount())
            System.out.println("\nQueue is full");
        else if (queue.getElementsCount() == 0)
            System.out.println("Queue is empty");
        else
//            Выводим сколько занято из всего свободных ячеек
            System.out.println("\nQueue is not full | " + queue.getElementsCount()
                    + "/" + queue.getMaxQueueSize());
    }

//    Получаем количество элементов в виде строки
    public static void elementsCount(ArrayQueueADT queue) {
        System.out.println(queue.getElementsCount() + " elements in queue");
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.isEmpty();
    }

//    Добавление нового элемента в очередь
    public static void add(ArrayQueueADT queue, int element) {

        queue.addElementInQueue(element);
        queue.setElementsCount(queue.getElementsCount() + 1);
    }

//    Удаление элемента из очереди со сдвигом элементов влево на одну ячейку
//    Это для того чтобы в начале очереди не было пустого значения
    public static void remove(ArrayQueueADT queue) {
        if (queue.getElementsCount() != 0) {
            for (int i = 0; i < queue.getElementsCount(); i++)
                queue.setQueueArrayElement(i, queue.getQueueArrayElement(i + 1));

            queue.setElementsCount(queue.getElementsCount() - 1);
        }
    }

//    Удаление всех элементов из очереди
    public static void removeAll(ArrayQueueADT queue) {
            queue.setElementsCount(0);
    }
//    Вывод всех элементов очереди в виде строки
    public static void displayElements(ArrayQueueADT queue) {
        if (queue.getElementsCount() != 0)
            queue.getQueue();
        else
            System.out.println("\nNothing to display");
    }
//    Получение первого элемента в виде строки
    public static void getFirstElement(ArrayQueueADT queue) {
        System.out.println("First element in queue: " + queue.getFirstElementIndex());
    }
//    Получение последнего элемента в виде строки
    public static void getLastElement(ArrayQueueADT queue) {
        System.out.println("Last element in queue: " + queue.getLastElementIndex());
    }
}
