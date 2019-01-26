/**
 * A vector of Strings program
 */
import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String args[]) {
        // Initialization of ArrayList, holding String objects
        MyArrayList<String> words = new MyArrayList<>(); 

        words.add("I");
        words.add("am");
        words.add("the");
        words.add("eggman");

        System.out.println(words);
        System.out.println(words.contains("eggman"));
        System.out.println(words.contains("asdf"));

        /*
        // Ex 17 -
        // i)
        words.add("We");
        words.add("are");
        words.add("the");
        words.add("eggmen");
        System.out.println(words);

        // ii)
        words.add(3, "red");
        System.out.println(words);

        // iii)
        words.remove(1);
        System.out.println(words);
        */
    }
}
