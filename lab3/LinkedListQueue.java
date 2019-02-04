public class LinkedListQueue<E> implements IQueue<E> {
    private DoublyLinkedList<E> list = new DoublyLinkedList<>();
    
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public E dequeue() {
        return list.dequeue();
    }

    public void enqueue(E value) {
        list.enqueue();
    }
}
