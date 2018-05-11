package mirea.isbo1016.queue.linked;

public interface Queue<E> {
    boolean isEmpty();
    int getSize();
    void enqueue(E e);
    E element();
    void dequeue();
    void displayElements();
    void removeAll();
}
