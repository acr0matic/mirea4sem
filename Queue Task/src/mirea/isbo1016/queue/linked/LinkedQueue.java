package mirea.isbo1016.queue.linked;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedQueue implements Queue {

    private static final int firstElementIndex = 0;

    private List<Object> linkedList = new LinkedList<>();
    private ListIterator<Object> iterator = linkedList.listIterator();

    private int lastElementIndex;

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public int getSize() {
        return linkedList.size();
    }

    @Override
    public void enqueue(Object obj) {
        iterator.add(obj);
        lastElementIndex++;
    }

    @Override
    public void dequeue() {
        System.out.println("Dequeued element: " +linkedList.get(firstElementIndex));
        if (!isEmpty()) {
            linkedList.remove(firstElementIndex);
            lastElementIndex--;
        }
        else
            System.out.println("Queue is empty.");
    }

    @Override
    public void removeAll() {
        while (!isEmpty())
            dequeue();
    }

    @Override
    public Object element() {
        return linkedList.get(0);
    }

    @Override
    public void displayElements() {
        if (isEmpty())
            System.out.println("Queue is empty.");
        else
            System.out.println(linkedList.toString());
    }
}
