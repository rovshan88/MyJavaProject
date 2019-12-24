package Gucci;

public class HW1 {
    public static void main (String[] args) {
        String myStatment = "I am a good programmer";
        char old = 'r';
        char f = 'f';
        String[] myStatamentW = myStatment.split(" ");
        int myStatmentW2 = myStatamentW.length;
        String myStatment2 = myStatment.substring(0,myStatment.lastIndexOf("programmer"));
        System.out.println(myStatment.replace(old,f));
        System.out.println(myStatmentW2);
        System.out.println(myStatment2);


        String Name = "Rovshan";
        int NameLength = Name.length();
        System.out.println(NameLength);

        String[] names = new String[8];
        names [0] = "Mohammad";
        names [1] = "John";
        names [2] = "Ferdous";
        names [3] = "Abul" ;
        names [4] =  "Ratna";
        names [5] = "Mareeha";
        names [6] = "Ruslan";
        names [7] = "Himani";

        boolean Igor1 = names [1].equals("JOHN");
        System.out.println(Igor1);


        //Store first names of 5 of your friends/colleagues in an array, and display the following in console:
        //    1. Length of that array
        //    2. Print name written on 3rd position (hint: 2nd index)
        //    3. Name of each friend/colleague
        //    4. Does name on 2nd position, start with "A"
        //
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
