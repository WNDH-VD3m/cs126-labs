/**
* A generic implementation of the IList iterface.
*/
public class Counter<E> implements ICounter<E> {

    MyArrayList<Count<E>> counts = new MyArrayList<>();
    
    public int getCount(E element) {
        // Returns the count of an item (the number of times it was added to the list).
        return this.find(element).getCount();
    }

    public boolean add(E element) {
        Count<E> count = find(element);
        if (count == null) {
            // If the element does not exist, add it as a new count object to counts.
            Count newElem = new Count(element, 1);
            this.counts.add(newElem);
        } else {
            // If the element does exist, increment its count value.
            count.incrementCount();
        }
        return true;
    }

    public int size() {
        // Returns the total count of all items in the list.
        int total = 0;
        for (int i=0;i<counts.size();i++) {
            total += counts.get(i).getCount();
        }
        return total;
    }

    // Returns the count object related to element.
    // Returns null if the element does not exist.
    private Count<E> find(E element) {
        for (int i=0;i<counts.size();i++) {
            if (counts.get(i).getObj().equals(element)) {
                return counts.get(i);
            }
        }
        return null;
    }

    public void clear() {
        counts.clear();
    }

    public boolean contains(E element) {
        return find(element) != null;
    }

    public boolean isEmpty() {
        return counts.isEmpty();
    }

    public boolean remove(E element) {
        Count<E> count = find(element);
        if (count == null) return false;
        else return counts.remove(count);
    }

    public static void main(String[] args) {
        Counter<String> counter = new Counter<>();
        counter.add("A");
        counter.add("A");
        counter.add("B");
        counter.add("B");
        counter.add("B");
        System.out.println(counter.getCount("A"));
        System.out.println(counter.getCount("B"));
        System.out.println(counter.size());
    }

}
