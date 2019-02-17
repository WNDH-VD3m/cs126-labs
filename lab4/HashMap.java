// This line allows us to cast our object to type (E) without any warnings.
// For further detais, please see: http://docs.oracle.com/javase/1.5.0/docs/api/java/lang/SuppressWarnings.html
@SuppressWarnings("unchecked") 
public class HashMap<K extends Comparable<K>,V> implements IMap<K,V> {

    protected KeyValuePairLinkedList[] table;
    
    public HashMap() {
        /* for very simple hashing, primes reduce collisions */
        this(11);
    }
    
    public HashMap(int size) {
        table = new KeyValuePairLinkedList[size];
        initTable();
    }

    // INCOMPLETE.
    public int find(K key) {
        //returns the number of comparisons required to find element using Linear Search.
        int hash_code = hash(key);
        int location = hash_code % table.length;

        ListElement<KeyValuePair<K,V>> temp = table[location].getHead();
        int comparisons = 0;
        while(temp != null) {
            comparisons++;
            if(temp.getValue().getKey().equals(key)) {
                return comparisons;
            }
            
            temp = temp.getNext();
        }
        
        return comparisons;
    }
    
    protected void initTable() {
        for(int i = 0; i < table.length; i++) {
            table[i] = new KeyValuePairLinkedList<>();
        }
    }
    
    protected int hash(K key) {
        int code = key.hashCode();
        return code;    
    }
    

    public void add(K key, V value) {
        int hash_code = hash(key);
        int location = hash_code % table.length;
        
        System.out.println("Adding " + value + " under key " + key + " at location " + location);
        
        table[location].add(key,value);
    }

    public V get(K key) {
        int hash_code = hash(key);
        int location = hash_code % table.length;
        
        ListElement<KeyValuePair> ptr = table[location].head;
        
        return (V)table[location].get(key).getValue();
    }
}
