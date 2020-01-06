package Gucci;

public class hWint {
    public static void main(String[] args) {
        String name = "Rovshan";
        int name1 = name.length();
        String name2 = name.replace('a', 'A');

        String name3 = name.toUpperCase();


        if ( name.length() > 8) {
            System.out.println(name2);
        }else {
            System.out.println(name3);
        }


//        Store your name in a variable.
//        if your name length comes out greater than 8
//        Display your name after replacing all 'a' to 'A' from your name.
//                Otherwise
//        Display your name in uppercase.
    }
}
