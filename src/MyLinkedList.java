import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements Iterable<E> {

    private Pointer<E> tail, first;
    private int size = 0;
    private int numberSelect;

    /**
     * Constructs an empty list.
     */
    public MyLinkedList() {
    }


    public boolean append(E e) {
        final Pointer<E> newPointer = new Pointer<>(tail, e, null);

        if (tail != null)
            tail.setNext(newPointer);
        else {
            first = newPointer;
        }


        this.size = newPointer.getIndex() + 1;
        this.tail = newPointer;
        return true;
    }

    public int size() {
        return size;
    }


    public Iterator<E> iterator() {
        return new RangeIterator();
    }

    public void removeLast() {
        final Pointer<E> pointer = tail;
        if (pointer.getNext() == null) {
            tail.setItem(null);
            tail = tail.getPrev();
            this.size--;
        }
    }

    public void setNumberSelect(int numberSelect) {
        this.numberSelect = numberSelect;
    }

    public Object removeItemGreaterThan() {
        return new Object(); // TODO
    }

    private class RangeIterator implements Iterator<E> {
        private Pointer<E> cursor = first;

        @Override
        public boolean hasNext() {
            // loop next point
            if (cursor == null || cursor.getIndex() > tail.getIndex()) {
                return false;
            }
            return true;
        }

        @Override
        public E next() {
            if (this.hasNext()) {
                Pointer<E> current = cursor;
                E item = current.getItem();
                cursor = cursor.getNext();
                return item;
            }
            throw new NoSuchElementException();
        }
    }
}
