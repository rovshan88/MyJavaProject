package Gucci;
import java.util.Scanner;

public class OOP {
    public static String  sayHello(String name, int age){
        System.out.println("hi "  + name);
        System.out.println("your age is: " +age);
        return name;

    }
    public static int sum (int numOne, int numTwo){
        int total = numOne + numTwo;

       return total;
    }
    public static void main(String[] args) {

        int total = sum (10,4);

        if (total > 10) {
            System.out.println("its too much");
        }
        String userName = sayHello("Mike",33);

        if (userName.equals("Mike")) {
            System.out.println("premium user");
        }
//        sayHello("mohammed",  21);

//        Scanner scanner = new Scanner (System.in);
//
//        Player player = new Player();
//        player.name = "Michael";
//        player.playerDetalis();
//        player.run();
//
//        Player player2 = new Player();
//        player2.name = "Tati";
//        player2.playerDetalis();
//        player2.jump();


    }
}
