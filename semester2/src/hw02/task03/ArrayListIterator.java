package hw02.task03;

/**
 *
 * @author ramntry
 */
public class ArrayListIterator<T> implements Iterator<T> {

    private int currentIndex = 0;
    private T[] collection;

    public ArrayListIterator(T[] array) {
        collection = array;
    }
    
    @Override
    public boolean hasNext() {
        return collection.length > currentIndex + 1;
    }

    @Override
    public T getNext() {
        step();
        return get();
    }

    @Override
    public T get() {
        return collection[currentIndex];
    }

    @Override
    public void set(T value) {
        collection[currentIndex] = value;
    }

    @Override
    public void step() {
        if (currentIndex + 1 >= collection.length)
            throw new ArrayIndexOutOfBoundsException();
    }
}
