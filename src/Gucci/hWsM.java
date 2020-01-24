package Gucci;
import java.util.Scanner;
public class hWsM {
    public static void main(String[] args) {
//        Scanner items = new Scanner(System.in);
//        System.out.println("Enter item you want to purchase ");
//        String item = items.next();
//        switch (item) {
//            case "Diapers":
//                System.out.println("you can find it at aisle one");
//                break;
//            case "Apple":
//            case "Orange":
//                System.out.println("You can find it at aisle two");
//                break;
//            case "Candy":
//                System.out.println("You can find it at aisle three");
//                break;
//            case "French fries":
//            case "Frozen Pizza":
//                System.out.println("You can find it at aisle seven");
//                break;
//            case "Eggs":
//            case "Donuts":
//                System.out.println("You can find it at aisle eight");
//                break;
//            default:
//                System.out.println("Out of stock");

        Scanner in = new Scanner(System.in);
        int[] intArr = {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
        System.out.print("Enter Element to be deleted : ");
        int elem = in.nextInt();

        for (int i = 0; i < intArr.length - 1; i++) {
            if (intArr[i] == elem) {
                for (int j = i; j < intArr.length - 1; j++) {
                    intArr[j] = intArr[j + 1];
                }

            }
        }

        System.out.println("Elements -- ");
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(" " + intArr[i]);
        }
    }
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


