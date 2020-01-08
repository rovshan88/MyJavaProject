package Gucci;
import java.util.Scanner;
public class loopHw {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number");
        int number = n.nextInt();
        boolean isPrime = true;

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * 1);

        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0);{
                isPrime=false;
                break;
            }

        }
        if (isPrime) {
            System.out.println(number + "is a prime");
        } else {
            System.out.println(number + " is not prime number");
        }


    }
}



