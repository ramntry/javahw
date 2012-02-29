package hw02.task03;

/**
 *
 * @author ramntry
 */
public class ArrayList<T> extends List<T> {

    T[] array;
    
    public ArrayList(int capacity) {
        array = new T[capacity];
    }
    
    @Override
    public void insert(Iterator<T> position, T value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove(Iterator<T> position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterator<T> begin() {
        return new ArrayListIterator(array);
    }

    @Override
    public Iterator<T> find() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
