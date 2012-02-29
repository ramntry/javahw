package hw02.task03;

/**
 *
 * @author ramntry
 */
public interface Iterator<T> {
    boolean hasNext();
    T getNext();
    T get();
    void set(T value);
    void step();
}
