package implementations;

public interface QueueADT<T> {
    void enqueue(T element);    
    T dequeue();                
    T first();                  
    boolean isEmpty();          
}
