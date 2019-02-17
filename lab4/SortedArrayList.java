public class SortedArrayList<E extends Comparable<E>> extends ArrayList<E> {
    
    public SortedArrayList() {
        super();
    }
    
    // INCOMPLETE.
    public boolean add(E element) {
        // Method to add element to the list, inserted in the correct place for the ordering of E.
        int i = 0;
        while (i < this.size() && this.get(i).compareTo(element) < 0) i++;
        // i points to first element larger than the given element
        // after insert, everything before the given element is less than it, everything after is more than it
        this.insert(i, element);
        return true;
    }

    // INCOMPLETE.
    public int findLinear(E element) {
        //returns the number of comparisons required to find element using Linear Search.
        int size = this.size();
        for (int i = 0; i < size; i++)
            if (this.get(i).equals(element)) return i + 1;
        return size;
    }
    
    // INCOMPLETE.
    public int findBinary(E element) {
        //returns the number of comparisons required to find element using Binary Search.
        int left = 0;
        int right = this.size() - 1;
        int comparisons = 0;
        while (right >= left) {
            // get element between left and right pointers
            int mid = (left + right) / 2;
            E pivot = this.get(mid);

            // increment number of comparisons
            comparisons++;

            // compare pivot with target element and update pointers
            int compare = pivot.compareTo(element);
            if (compare == 0) return comparisons; 
            else if (compare > 0) right = mid - 1;
            else left = mid + 1;
        }
        return comparisons;
    }

    public static void main(String[] args) {
        // Milestone 1
        SortedArrayList<Integer> a = new SortedArrayList<>();
        a.add(5);
        a.add(3);
        a.add(1);
        System.out.println(a.toString());
        System.out.println(String.format("Comparison count: 1-%d 3-%d 5-%d 9-%d", a.findLinear(1), a.findLinear(3), a.findLinear(5), a.findLinear(7)));
        // worst case number of comparisons = number of elements in the list i.e. O(n)
        // The closer to the beginning of the list the data being searched is, the fewer the number of comparisons

        /*
        // Milestone 2
        SortedArrayList<Integer> a = new SortedArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);
        System.out.println(a.toString());

        System.out.println(String.format("Comparison count: 1-%d 3-%d 5-%d 10-%d", a.findBinary(1), a.findBinary(3), a.findBinary(5), a.findBinary(10)));

        // search for each element in the list and sum the number of comparisons made by each search algorithm
        double avgBinarySearchComparisons = 0;
        double avgLinearSearchComparisons = 0;
        int size = a.size();
        for (int i = 0; i < size; i++) {
            int elem = a.get(i);
            avgLinearSearchComparisons += a.findLinear(elem);
            avgBinarySearchComparisons += a.findBinary(elem);
        }

        // get the average number of comparisons made by each search algorithm
        avgLinearSearchComparisons /= size;
        avgBinarySearchComparisons /= size;
        System.out.println("Average number of linear search comparisons - " + avgLinearSearchComparisons);
        System.out.println("Average number of binary search comparisons - " + avgBinarySearchComparisons);

        // binary search has time complexity O(lgn), whereas linear search has O(n)
        // linear search is used on unsorted arrays, whereas binary search is used on sorted arrays
        */
    }
}
