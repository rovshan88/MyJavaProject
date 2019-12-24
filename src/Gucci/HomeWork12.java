package Gucci;

public class HomeWork12 {
    public static void main (String[] args) {
    //Store first names of 5 of your friends/colleagues in an array, and display the following in console:
    //    1. Length of that array
    //    2. Print name written on 3rd position (hint: 2nd index)
    //    3. Name of each friend/colleague
    //    4. Does name on 2nd position, start with "A"
    // */
    String [] friends = new String [5];
    friends [0] = "Misha";
    friends [1] = "Tanya";
    friends [2] = "Anya";
    friends [3] = "Varya";
    friends [4] = "Ksusha";
    int friends3 = friends.getClass(friends[2]);
        System.out.println("Third positon of the friends: " + friends3);
    }


}
