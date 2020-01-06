package Gucci;
import java.util.Scanner;

public class hWdivisible15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int x = sc.nextInt();

        if ( x % 15 == 0 ) {
            System.out.println( x + " divisible by 15");
        } else {
            System.out.println( "The remainder is " + x % 15);
        }
        }
       // Store a number in an int variable.
     //   if the number is divisible by 15
     //   Display "Divisible by 15"
     //   Otherwise
      //  Display the remainder you get when divide number by 15
    }

