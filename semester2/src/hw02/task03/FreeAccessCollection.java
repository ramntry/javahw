package hw02.task03;

/**
 *
 * @author ramntry
 */
public interface FreeAccessCollection<T> extends IterableCollection<T> {
    void insert(Iterator<T> position, T value);
    void remove(Iterator<T> position);
}
