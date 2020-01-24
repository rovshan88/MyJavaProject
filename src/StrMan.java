import java.nio.charset.Charset;

public class StrMan {
    public static void main(String[] args) {
        String s = "GeeksforGeeks";
        String s1 = new String ("Geeks");
        System.out.println(s + s1);

        byte [] b_arr = new byte [] {70, 101, 101, 107, 115};
        Charset cs = Charset.defaultCharset();
        String s_byte_char = new String(b_arr, cs);
        System.out.println(s_byte_char);

        char char_arr[] = {'G', 'e', 'e', 'k', 's'};
        String s2 = new String(char_arr); //Geeks
//        System.out.println(s2);
//
//        String s3 = new String(char_arr , 1, 3); //eek
//        System.out.println(s3);
//
//        //int length(): Returns the number of characters in the String.
//
//        int sLen = s.length();
//        System.out.println(sLen);
//
//        //Char charAt(int i) Returns the character at ith index.
//         char s4 = s.charAt(3);
//        System.out.println(s4);
//
//        //String substring (int i): Return the substring from the ith  index character to end.
//
//        String s5 = s.substring(3);
//        System.out.println(s5);
//
//        //int indexOf (String s): Returns the index within the string of the first occurrence of the specified string.
//         int s6 = s.indexOf("for");
//        System.out.println(s6);
//        int s7 = s.indexOf("for",2);
//        System.out.println(s7);
//        int s8 = s.lastIndexOf("e");
//        System.out.println(s8);
//        int compSs2 = s.compareTo(s1);
//        System.out.println("comp " +compSs2);
//        String subS = s.substring(6);
//        System.out.println(subS);
//        String subS1 = s.substring(1,6);
//        System.out.println(subS1);


//      // tokens  to count words in sring by converting in arr, and getting the leng without space
        String greatings = "Good Morning Babe";
        String [] allWordsGre = greatings.split(" ");
        int greatLeng = allWordsGre.length;
        System.out.println(greatLeng);





    }
}
