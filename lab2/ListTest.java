/**
  Program to test out singly linked-list ADT
*/
public class ListTest
{
    public static void main(String[] args)
    {
        // do some work here...
        MyLinkedList<Integer> a = new MyLinkedList<>();
        MyLinkedList<String> b = new MyLinkedList<>();
        MyLinkedList<Integer> c = new MyLinkedList<>();
        System.out.println("b before - " + b.toString());
        b.add("Jacob");
        System.out.println("b after - " + b.toString());
        c.add(1);
        c.add(2);
        c.add(3);
        c.addToTail(4);
        c.addToTail(5);
        System.out.println("c - " + c.toString());
        System.out.println(c.removeFromTail() + " was removed");
        System.out.println("c - " + c.toString());
        System.out.println("a size - " + a.size());
        System.out.println("b size - " + b.size());
        System.out.println("c size - " + c.size());
        
    }
}
