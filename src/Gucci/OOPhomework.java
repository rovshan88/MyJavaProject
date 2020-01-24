package Gucci;

import java.util.Arrays;

public class OOPhomework {
    public static String revWord(String word) {

        int wordLen = word.length();
        String revWord1 = "";
        for (int i = 0; i <= wordLen - 1; i++) {
            revWord1 = revWord1 + word.charAt(wordLen - 1 - i);
        }
        return revWord1;
    }

    public static int[] revArr(int[] num) {

        int numLen = num.length;
        int[] revArr1 = new int[numLen];
        for (int i = 0; i <= numLen - 1; i++) {
            revArr1[i] = num[numLen - 1 - i];
        }
        return revArr1;
    }

    public static int sum(int[] arr) {
        int arrLen = arr.length;
        int sum = 0;


        for (int i = 0; i <= arrLen - 1; i++) {
            sum += arr[i];
        }
        return sum;

    }

    public static int averArr(int [] numb) {
        int numbLen = numb.length;
       int sum = 0;
        int averA = 0;

        for (int i = 0; i <= numbLen - 1; i++) {
            sum += numb[i];
            averA = sum / numbLen;
        }
        return averA;
    }

    public static int[] arrSort(int[] arrS) {
        Arrays.sort(arrS);
        return arrS;
    }
    public static int arrMax(int[] arrayNum) {
        int max = 0;
        int arrayNumLen = arrayNum.length;
        for (int i = 0; i < arrayNumLen; i++) {
            if (arrayNum[i] > max)
                max = arrayNum[i];
        }
        return max;
    }
    public static int  arrMin (int [] num) {
        int min = num [0];
        int numLen = num.length;
        for (int i = 0; i < numLen; i ++) {
            if (num[i] < min)
                min = num[i];

        }
        return min;
    }
//    public static String oOtd (String word){
//        String word1 = String.valueOf(word.toCharArray());
//    }
//    Create abbreviation for any string
//*        Eg: Input to method : Outfit of the day ( or Good morning or Happy new year)
//*              Output/Return from method : OOTD ( or GM or HMY)


    public static void main(String[] args) {

        int arr [] = new int [] {45,15,20,30,40};
        System.out.println(revWord("Sample"));

        System.out.println(Arrays.toString(revArr(arr)));
        System.out.println("sum of arrys is " + sum(arr));
        System.out.println("aver of arr " + averArr(arr));
        System.out.println("array sort " + Arrays.toString(arrSort(arr)));
        System.out.println("maximum number in given array is: " + arrMax(arr));
        System.out.println("min number in given arr is: " + arrMin(arr));

    }

}

