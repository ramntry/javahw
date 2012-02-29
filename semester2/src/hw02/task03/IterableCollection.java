package hw02.task03;

/**
 *
 * @author ramntry
 */
public interface IterableCollection<T> extends Collection {
    Iterator<T> begin();
    Iterator<T> find();
}
