import java.util.Arrays;

public class Test {
//    Create a method to return missing smallest positive integer (greater than 0) from given array.
//    Example:
//    For array : [1,3,5,4,2,7]
//    Method should return : 6
    public static int getSmallestNum (int [] num ) {
        Arrays.sort(num);
        int i = 1;
        for (int j = 0; j<num.length; j++) {
            if (num[j] == i) {
                i++;
            }
        }
        return i;
        }


    public static void main(String[] args) {
        int [] num = new int [] {1,3,5,4,2,7};
        int []num1 = new int [] {-1, -3, 4, 2};
        int [] num2 = new int [] {0, 5, -1, 1, 2, 4, 5, 3, 7, 1, 2};
        System.out.println("Missing number is: " + getSmallestNum(num));
        System.out.println("Mising positive number is:"+ getSmallestNum(num1));
        System.out.println("Missing number is:" + getSmallestNum(num2));

    }
}


//    For array : [-1, -3, 4, 2]
//    Method should return : 1
//    For array : [0, 5, -1, 1, 2, 4, 5, 3, 7, 1, 2]
//    Method should return : 6
//    Write a Java program to remove a specific element from an array.
//    Original array: [32, 14, 24, 98, 24, 56, 148, 24, 78, 24]
//    New Array: [32, 14, 98, 56, 148, 78]
//    public static int []  newArr (int [] arr) {
//        int arr1 [] = new int[] {32, 14, 24, 98, 24, 56, 148, 24, 78, 24};
//
////        int newArr [] = new int [] { Arrays.toString(arr1).indexOf(24)};
////        return newArr = newArr;
//        for(int i =0; i<arr1.length-1;i++) {
//            if (arr[i]==24){
//                for (int j = i; j< arr1.length -1;j++){
//                    arr1[j]=arr1[j+1];
//                }
//
//
//            }
//        }
//        System.out.println("elements");
//        for (int i =0; i < arr1.length; i++){
//            System.out.println(" "+ arr1 [i]);
//        }
//        return arr;




