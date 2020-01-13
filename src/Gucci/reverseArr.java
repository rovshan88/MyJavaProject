package Gucci;

public class reverseArr {
    public static void main(String[] args) {
        String myString = "reverse this";
        int stringlen = myString.length();
        String reversed = "";
        char rev = myString.charAt(stringlen-1);
        for  ( int i = 0; i <= stringlen -1; i ++ ) {
            reversed = reversed + myString.charAt(stringlen -1 - i);
            System.out.println(reversed);
        }

    }
}
