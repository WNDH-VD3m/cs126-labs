public class MyQueue<E> implements IQueue<E> {

    private ListElement<E> head;
    private ListElement<E> tail;

    public MyQueue() {
        head = null;
        tail = null;
    }
    
    public boolean isEmpty() {
        return (head == null);
    }

    public E dequeue() {
        if (isEmpty()) {
            return null;
        }

        ListElement<E> tmp = head;
        head = tmp.getNext();

        if (head == null) {
            tail = null;
        }

        return tmp.getValue();
    }

    public void enqueue(E value) {
        ListElement<E> tmp = new ListElement<>(value);

        if (isEmpty()) {
            tail = head = tmp;
        } else {
            tail.setNext(tmp);
            tail = tmp;
        }
    }

    public String toString() {
        ListElement<E> ptr = head;
        String str = "";

        while (ptr != null) {
            str += ptr.getValue() + " ";
            ptr = ptr.getNext();
        }

        return str;
    }

    public void modifyHead(E val) {
        ListElement<E> temp = new ListElement<>(val);
        temp.setNext(head.getNext());
        head = temp;
    }

    public static void main(String[] args) {
        MyQueue<Integer> test = new MyQueue<>();
        test.enqueue(1);
        test.enqueue(2);
        System.out.println(test.toString());
        test.modifyHead(3);
        System.out.println(test.toString());
    }
}
