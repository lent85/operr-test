public class Pointer<E> {

    private int index;
    private E item;
    private Pointer<E> next;
    private Pointer<E> prev;

    Pointer(Pointer<E> prev, E element, Pointer<E> next) {
        if (prev == null)
            this.index = 0;
        else this.index = prev.getIndex() + 1;

        this.item = element;
        this.next = next;
        this.prev = prev;
    }

    public int getIndex() {
        return index;
    }

    public Pointer<E> getNext() {
        return this.next;
    }

    public void setNext(Pointer<E> nextElement) {
        this.next = nextElement;
    }

    public E getItem() {
        return this.item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public Pointer<E> getPrev() {
        return this.prev;
    }
}
