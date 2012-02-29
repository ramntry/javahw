package hw02.task03;

/**
 *
 * @author ramntry
 */
public interface BidirectionalIterator<T> extends Iterator<T> {
    T getPrev();
    void backStep();
}
