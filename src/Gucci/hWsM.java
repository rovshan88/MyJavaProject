package Gucci;
import java.util.Scanner;
public class hWsM {
    public static void main(String[] args) {
        Scanner items = new Scanner(System.in);
        System.out.println("Enter item you want to purchase ");
        String item = items.next();
        switch (item) {
            case "Diapers":
                System.out.println("you can find it at aisle one");
                break;
            case "Apple":
            case "Orange":
                System.out.println("You can find it at aisle two");
                break;
            case "Candy":
                System.out.println("You can find it at aisle three");
                break;
            case "French fries":
            case "Frozen Pizza":
                System.out.println("You can find it at aisle seven");
                break;
            case "Eggs":
            case "Donuts":
                System.out.println("You can find it at aisle eight");
                break;
            default:
                System.out.println("Out of stock");
        }




//        Create a supermarket item finder
//        Take input from user and based on the input, you should display user which aisle has the item
//        For example: user enter milk, you program should say aisle 8. If the item is not found,
//        display a message saying "Out of stock "Please create program for below requirement
//        Milk = Aisle Eight
//                Eggs = Aisle Eight
//        French Fries = Aisle seven
//                Candy = Aisle Three
//        Frozen Pizza = Aisle seven
//                Donuts = Aisle Eight
//                Diapers = Aisle One
//                Apple = Aisle two
//                Orange = Aisle two
    }
}
