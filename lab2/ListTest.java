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
        b.add("Jacob");
        c.add(1);
        c.add(2);
        c.add(3);
        System.out.println(a.size());
        System.out.println(b.size());
        System.out.println(c.size());

    }
}
