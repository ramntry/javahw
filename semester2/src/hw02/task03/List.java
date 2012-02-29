package hw02.task03;

/**
 *
 * @author ramntry
 */
public abstract class List<T> implements FreeAccessCollection<T> {
    
    protected int size = 0;
    
    @Override
    public int length() {
        return size;
    }
    
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
