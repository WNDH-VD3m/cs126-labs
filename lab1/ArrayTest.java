/**
 * An array of Strings program
 */
public class ArrayTest {

    public static void main(String args[]) {
        String words[] = new String[4];

        words[0] = "I";
        words[1] = "am";
        words[2] = "the";
        words[3] = "eggman";
        /*
        Ex 13 -
        Exception thrown - java.lang.ArrayIndexOutOfBoundsException
        words[4] = "a";
        */
        /*
        Ex 14 -
        i) Create a new array of size 8. Copy everything from words
        into the new array. Assign the remaining elements to the new
        words to be appended.
        ii) Create a new array of size 5. Copy everything up to the word
        "the" into the new array. Assign the word "red" to the next free space.
        Copy the remaining words to the new array.
        iii) Copy everything after the word "am" to the previous index. Assign 
        the value of null to the last word.
        */

        System.out.println(String.join("\n", words));


    }
}
