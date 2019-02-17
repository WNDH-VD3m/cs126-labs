
public class HashCodeExample {

    public static void main(String[] args) {
        // hash remains the same if the words are anagrams of one another
        System.out.println("hash(\'Hello\')=" + generateHashCode("Hello"));
        System.out.println("hash(\'eolHl\')=" + generateHashCode("eolHl"));

        // hash remains the same if total forward shift in alphabetical order equals backward shift
        // e.g. d is shifted forward 1 to e, while b is shifted back 1 to a
        System.out.println("hash(\'Goodbye\')=" + generateHashCode("Goodbye"));
        System.out.println("hash(\'Gooeaye\')=" + generateHashCode("Gooeaye"));
        
        // Ex 9
        // Static array of linked lists
        // Add data => hash key and mod it to find location in static array to store data => add the data to the head of the linked list at the given location
        HashMap<Character, Character> a = new HashMap<>();
        for (char alpha = 'a'; alpha <= 'z'; alpha++) {
            a.add(alpha, alpha);
        }

        double avgNumberOfComparisons = 0;
        for (char alpha = 'a'; alpha <= 'z'; alpha++) {
            avgNumberOfComparisons += a.find(alpha);
        }
        avgNumberOfComparisons /= 26.0;
        // location 9 contains w->l->a
        System.out.println(String.format("Comparisons - a-%d l-%d w-%d", a.find('a'), a.find('l'), a.find('w')));
        System.out.println("Average number of comparisons - " + avgNumberOfComparisons);
    }

    public static int generateHashCode(String s) {
        int code = 0;
        
        for(char next_character: s.toCharArray()) {
            code += next_character;
        }
        
        return code;
    }
}
