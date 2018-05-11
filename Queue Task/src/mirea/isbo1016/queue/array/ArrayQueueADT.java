package mirea.isbo1016.queue.array;

public class ArrayQueueADT {

//    Абстрактный тип данных - очередь
//    Содержит в себе конструктор и набор геттеров и сеттеров для работы класса-оболочки "ArrayQueue"

    private int[] queue;
    private int maxQueueSize;
    private int elementsCount;
    private int lastElementIndex;
    private int firstElementIndex;

//    Конструктор
//    - maxQueueSize - максимальный размер очереди
//    - queue - задаем новый массив ориетируясь на максимальный размер
//    - elementsCount - иницилизируем количество элементов
//    - lastElementIndex - иницилизируем последний элемент
//    - firstElementIndex - иницилизируем первый элемент
    public ArrayQueueADT(int maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
        this.queue = new int[maxQueueSize];
        this.elementsCount = 0;
        this.lastElementIndex = -1;
        this.firstElementIndex = 0;
    }

//    Здесь все методы PROTECTED, это для того чтобы нельзя было получать доступ к ним из другого package,
//    Другими словами, соблюдение инкапсуляции.
    protected int getMaxQueueSize() {
        return maxQueueSize;
    }

//    Получить количество элементов
    protected int getElementsCount() {
        return elementsCount;
    }
//    Получить индекс последнего элемента
    protected int getLastElementIndex() {
        return lastElementIndex = queue[elementsCount - 1];
    }

//    Проверка заполненности очереди
    protected boolean isEmpty() {
        return (elementsCount == 0);
    }

//    Получить индекс первого элемента
    protected int getFirstElementIndex() {
        return queue[firstElementIndex];
    }

    protected int getQueueArrayElement(int index){
        return queue[index];
    }

    protected void setQueueArrayElement(int index, int element){
        queue[index] = element;
    }

//    Получить очередь
    protected void getQueue() {
        System.out.print("\nIn queue: ");
        for (int i = 0; i < elementsCount ; i++)
            System.out.print(queue[i] + " ");
    }
//    Добавить элемент в очередь
    protected void addElementInQueue(int element) {
        queue[elementsCount] = element;
    }

//    Изменить количество элементов
    protected void setElementsCount(int Count) {
        this.elementsCount = Count;
    }


}
