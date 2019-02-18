public class Coder {
    private static final char startAscii = 'a';

    private static String code[] = {
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", 
            "...", "-", "..-", "...-", ".--", "-..-", 
            "-.--", "--.."};

    public static String encode(char c) {
        String str="?";
        
        if ((c>='a')&&((c<='z'))) {
            // TODO: lookup string from the table
            str = code[c - startAscii] + " ";
        } else if( c ==' ' || c == '\t' ) {
            str = c+"";
        }
        return str;
    }
}
