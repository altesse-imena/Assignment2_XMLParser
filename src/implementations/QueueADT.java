package implementations;

import java.io.Serializable;
import java.util.NoSuchElementException;

/**
 * The QueueADT interface represents a queue abstract data type.
 * It follows First-In-First-Out (FIFO) order for element access.
 *
 * @param <T> The type of elements in the queue.
 */
public interface QueueADT<T> extends Serializable {

    /**
     * Adds an element to the end of the queue.
     * 
     * @param element The element to be added to the queue.
     * @throws NullPointerException if the element is null.
     */
    void enqueue(T element) throws NullPointerException;

    /**
     * Removes and returns the element at the front of the queue.
     * 
     * @return The element removed from the front of the queue.
     * @throws NoSuchElementException if the queue is empty.
     */
    T dequeue() throws NoSuchElementException;

    /**
     * Returns the element at the front of the queue without removing it.
     * 
     * @return The element at the front of the queue.
     * @throws NoSuchElementException if the queue is empty.
     */
    T first() throws NoSuchElementException;

    /**
     * Returns the number of elements in the queue.
     * 
     * @return The number of elements in the queue.
     */
    int size();

    /**
     * Checks whether the queue is empty.
     * 
     * @return true if the queue is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * Clears all elements from the queue.
     */
    void clear();
}
