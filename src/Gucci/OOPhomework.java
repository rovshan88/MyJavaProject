package Gucci;

import java.util.Arrays;

public class OOPhomework {
    public static String revWord (String word) {

        int wordLen = word.length();
        String revWord1 = "";
        for (int i=0; i<=wordLen-1;i++){
            revWord1 = revWord1 + word.charAt(wordLen-1 - i);
        }
        return revWord1;
    }
    public static int[] revArr  (int [] num ) {

        int numLen = num.length;
        int [] revArr1 = new int[numLen];
        for (int i=0; i<= numLen -1; i++){
            revArr1[i]= num [numLen-1-i];
        }
        return revArr1;
    }
    public static int sum (int [] arr){
        int arrLen = arr.length;
        int sum = 0;


        for (int i = 0; i <= arrLen-1; i++){
            sum += arr[i];
        }
        return sum;

    }
    public static double averArr (double [] numb){
        double numbLen = numb.length;
        double sum = 0;
        double averA = 0;

        for (int i = 0;i <=numbLen-1;i++ ){
            sum +=numb[i];
            averA = sum/numbLen;
        }
        return averA;
    }
    public static int [] arrSort (int [] arrS) {
        Arrays.sort(arrS);
        return arrS;
    }








    public static void main(String[] args) {
        System.out.println(revWord("Sample"));
        System.out.println(revArr( new int [] {10,20,30}).toString());
        System.out.println("sum of arrys is " + sum( new int[] {20,10,40,44}));
        System.out.println("aver of arr " + averArr(new double [] {20,10,40,44} ));
        System.out.println("array sort "+ arrSort(new int[] {20,10,40,44}).toString());

    }
}
//4. *Sort an array
//        *        Eg: Input to method : [20, 10, 40, 44]
//        *              Output/Return from method : [10, 20, 40, 44