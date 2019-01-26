import java.util.Arrays;

/**
* A generic implementation of the IList iterface.
*/
public class MyArrayList<E> implements IList<E> {

    private Object[] array;
    private int size;
    private int capacity;
    
    public MyArrayList() {
        this.capacity = 100;
        this.array = new Object[capacity];
        this.size = 0;
    }
    
    
    public boolean add(E element) {
        // Adds element to the list, returns true on success and false otherwise.
        try {
            if (this.size == this.capacity) {
                Object[] newArray = Arrays.copyOf(this.array, this.capacity + 1);
                this.array = newArray;
                this.capacity++;
            }
            this.array[this.size] = element;
            this.size++;
            return true;
        } catch(Exception e) {
            return false;
        }
        
        /* Ex 19 -
        i) + No chance of it allocating memory to never be used
        - Expensive if add() is called a lot since copyOf will be called
        everytime
        ii) + converse of i)
        - converse of i)
        iii) + converse of i)
        - converse of i) and exponential growth in extra space which could
        lead to lots of allocated memory that is never used v. fast
        */
    }

    
    public boolean contains(E element) {
        for (Object currentElem: this.array) {
            if (currentElem != null && currentElem.equals(element)) return true;
        }
        return false;
    }

    public void clear() {
        this.capacity = 100;
        this.array = new Object[capacity];
        this.size = 0;
    }
    
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    public int size() {
        return size;
    }
    
    // This line allows us to cast our object to type (E) without any warnings.
    // For further detais, please see: http://docs.oracle.com/javase/1.5.0/docs/api/java/lang/SuppressWarnings.html
    @SuppressWarnings("unchecked") 
    public E get(int index) {
        return (E) this.array[index];
    }
    
    public int indexOf(E element) {
        for (int i=0;i<this.size();i++) {
            if (element.equals(this.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(E element) {
        int index = this.indexOf(element);
        if (index >= 0) {
            E removed = this.get(index);
            for (int i=index+1;i<this.size();i++) {
                this.set(i-1, this.get(i));
            }
            this.array[size-1] = null;
            size--;
            return true;
        }
        return false;
    }

    public E set(int index, E element) {
        if (index >= this.size()) {
            throw new ArrayIndexOutOfBoundsException("index > size: "+index+" >= "+size);
        }
        E replaced = this.get(index);
        this.array[index] = element;
        return replaced;
    }
    
    
    public String toString() {
        if (this.isEmpty()) {
            return "[]";
        }
        StringBuilder ret = new StringBuilder("[");
        for (int i=0;i<size;i++) {
            ret.append(this.get(i)).append(", ");
        }
        ret.deleteCharAt(ret.length()-1);
        ret.setCharAt(ret.length()-1, ']');
        return ret.toString();
    }
    
}
