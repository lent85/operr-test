import java.util.Iterator;

public class TestMyList {
    public static void main(String[] args) {
        // Create myList
        MyLinkedList<Integer> myListLinkedList = new MyLinkedList<Integer>();

        // Add objects to myList
        myListLinkedList.append(1);
        myListLinkedList.append(2);
        myListLinkedList.append(3);
        myListLinkedList.append(4);

        // Show list through Iterator
        Iterator<Integer> itr = myListLinkedList.iterator();
        System.out.print("List Before remove item ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }

        // remove last  item
        myListLinkedList.removeLast();
        // Show list through Iterator
        Iterator<Integer> itr1 = myListLinkedList.iterator();
        System.out.print("List after remove last item ");
        while (itr1.hasNext()) {
            System.out.print(itr1.next() + ", ");
        }

        // Remove greater than
        MyLinkedList<Integer> myListLinkedList1 = new MyLinkedList<Integer>();
        // Add objects to myList
        myListLinkedList1.append(1);
        myListLinkedList1.append(2);
        myListLinkedList1.append(3);
        myListLinkedList1.append(4);
        // set value greater than
        myListLinkedList1.setNumberSelect(3);
        // Show list through Iterator
        Object result = myListLinkedList.removeItemGreaterThan();
    }
}
