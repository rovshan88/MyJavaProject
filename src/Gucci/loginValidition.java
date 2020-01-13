package Gucci;
import java.awt.*;
import java.util.Scanner;

public class loginValidition {
    public static void main(String[] args) {
      //  Homework:
//	 Simple password validation for login system
        //	instance of scanner
        Scanner scanUserName = new Scanner(System.in);
        Scanner scanPassword = new Scanner(System.in);

        //Tell user to enter password
        System.out.println("Please enter your username");
        System.out.println("Please enter your password");
        //takes input from console and storing the value into actualPassword variable
        String actualUserName = scanUserName.nextLine();
        String actualPassword = scanPassword.nextLine();
        //setting expected password which is associated with user account details in database
        String expectedUserName = "rovshan";
        String expectedPassword = "technosoft";
        //Creating for loop to give user max tries to enter valid password and log the user to system if
        //correct password is entered
        for (int i = 0; i < 5; i++) {
            //checking if actual password is not equal to expected password
            if (!actualPassword.equals(expectedPassword) || !actualUserName.equals(expectedUserName)) {
                //subtracting the count by iteration so user will have less tries (-1 every miss tries)
                int count = 5 - i;
                //console message to user to enter valid password
                System.out.println("Please enter the valid password or User name");
                //console message to let user know how many more tries he has left with
                System.out.println("You have " + count + " more tries");
                //letting user to update the actualPassword value with new input from console
                actualUserName = scanUserName.nextLine();
                actualPassword = scanPassword.nextLine();
                //if count equals to 9, then notifying user with custom message
                if (i == 4) {
                    System.out.println("Your account will be locked for 10 min");
                }
            } else {
                // if any point in the loop user enters correct password then system let user into home page
                System.out.println("Welcome to home page");
                break;
            }
        }
    }
}
///**
// * Test Cases
// * 1. Verify username & password is correct scenario
// */
///**
// * Homework:
// * 1. Create a system that checks valid username and password
// * And if they both are valid then only system displays homepage
// * User can only try upto 5 times with invalid login details
// * if it reaches 5 times then system should be locked for 10 min
// * 2. Fix existing bug from the system
// * 3. Write test cases to validate the scenario
// *
//    }
//}
