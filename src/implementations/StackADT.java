package implementations;

import java.io.Serializable;
import java.util.EmptyStackException;

/**
 * The StackADT interface represents a stack abstract data type.
 * It follows Last-In-First-Out (LIFO) order for element access.
 *
 * @param <T> The type of elements in the stack.
 */
public interface StackADT<T> extends Serializable {

    /**
     * Pushes an element onto the top of the stack.
     * 
     * @param element The element to be pushed onto the stack.
     * @throws NullPointerException if the element is null.
     */
    void push(T element) throws NullPointerException;

    /**
     * Removes and returns the element at the top of the stack.
     * 
     * @return The element removed from the top of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    T pop() throws EmptyStackException;

    /**
     * Returns the element at the top of the stack without removing it.
     * 
     * @return The element at the top of the stack.
     * @throws EmptyStackException if the stack is empty.
     */
    T peek() throws EmptyStackException;

    /**
     * Returns the number of elements in the stack.
     * 
     * @return The number of elements in the stack.
     */
    int size();

    /**
     * Checks whether the stack is empty.
     * 
     * @return true if the stack is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * Clears all elements from the stack.
     */
    void clear();
}
