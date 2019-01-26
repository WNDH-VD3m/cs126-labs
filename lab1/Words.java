import java.io.IOException;

/**
 * Test out WordReader class.
 */

public class Words {

    public static void main(String args[]) {
        
        try {
            
            //Create a WordReader object to read words from a file.
            WordReader in = new WordReader(args[0]);
            String str = null;
            Set<String> set = new Set<>();

            // Keep reading words while next word is not-null.
            /*
            Ex 10 -
            readWord returns non-null value until EOF is reached at which point
            it returns null and the loop breaks
            */
            while ((str = in.readWord()) != null) {
                set.add(str);
            }

            System.out.println(set);
            // print out 10 random words
            set.printNRandom(10);
            
            in.close(); // Close the file.
            
        } catch (IOException ex) {
            System.out.println("Error :" + ex);
            System.exit(1);
        }
        
    }
}
