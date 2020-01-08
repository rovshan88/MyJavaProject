package Gucci;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class hWcarMood {
    public static void main(String[] args) {


        int [] studentInClass = new int[5];
        studentInClass[0] = 1;
        studentInClass[1] = 1;
        studentInClass[2] = 1;
        studentInClass[3] = 2;
        studentInClass[4] = 2;
        int arrLenght = studentInClass.length;
        int sumArr = IntStream.of(studentInClass).sum();
        int averStu = sumArr/arrLenght;
        //String reverse = studentInClass.

        if (averStu >25) {
            System.out.println (Arrays.toString(studentInClass));
        } else {
            System.out.println ("Print index" + studentInClass[arrLenght-2] + ", " + studentInClass[arrLenght-3] + ", " +
                    studentInClass[arrLenght-4] + ", " + studentInClass[arrLenght-5]);
        }





    }
}