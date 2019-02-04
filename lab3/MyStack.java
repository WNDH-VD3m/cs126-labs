public class MyStack<E> implements IStack<E> {
    DoublyLinkedList<E> list = new DoublyLinkedList<>();

    // INCOMPLETE.
    public void push(E val) {
        //  TODO: implement pushing
        list.addToHead(val);
    }

    // INCOMPLETE.
    public E pop() {
        //  TODO: implement popping
        return list.removeFromHead();
    }

    // INCOMPLETE
    public boolean isEmpty() {
        //  TODO: check whether list is empty
        return list.isEmpty();
    }

    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        MyStack<Integer> test = new MyStack<>();
        test.push(1);
        test.push(2);
        System.out.println(test.toString());
        test.pop();
        System.out.println(test.toString());
    }
}
