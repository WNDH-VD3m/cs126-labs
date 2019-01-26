import java.util.Random;

/**
* A generic implementation of the IList iterface.
*/
public class Set<E> implements ISet<E> {
    
    private MyArrayList<E> array = new MyArrayList<>();

    public boolean add(E element) {
        // Adds element to the list when it does not already exist.
        // Returns true on success and false otherwise.
        if (this.array.contains(element)) return false;
        this.array.add(element);
        return true;
    }
    
    
    public String toString() {
        return this.array.toString();
    }
    
    public void clear() {
        array.clear();
    }

    public boolean contains(E element) {
        return array.contains(element);
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

    public boolean remove(E element) {
        return array.remove(element);
    }

    public int size() {
        return array.size();
    }

    public boolean printNRandom(int n) {
        MyArrayList<E> removedElems = new MyArrayList<>();
        // if there aren't enough elements to print n, return false
        if (this.size() < n) return false;
        // get random element, print it, remove it, keep track of elements removed
        for (int i = 0; i < n; i++) {
            E elem = this.getRandom();
            System.out.println(elem);
            this.array.remove(elem);
            removedElems.add(elem);
        }
        // add all elements that were removed back to set
        for (int i = 0; i < n; i++) this.array.add(removedElems.get(i));
        return true;
    }

    public E getRandom() {
        return this.array.get((new Random()).nextInt(this.size()));
    }
    
    public static void main(String[] args) {
        Set<Integer> set = new Set<>();
        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set);
    }
}
