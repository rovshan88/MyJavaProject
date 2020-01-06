package Gucci;

import java.util.stream.IntStream;

public class hWcarMood {
    public static void main(String[] args) {


        int [] studentInClass = new int[5];
        studentInClass[0] = 25;
        studentInClass[1] = 20;
        studentInClass[2] = 100;
        studentInClass[3] = 25;
        studentInClass[4] = 20;
        int arrLenght = studentInClass.length;
        int sumArr = IntStream.of(studentInClass).sum();
        int averStu = sumArr/arrLenght;
        int studI = 0;
        boolean stud2 = studI < 0;



        //int stud1 = studentInClass






//        If you average of stored numbers greater than 25
//        Display Array from index 0 to last
//        Otherwise
//        Display Array from index last to 0

    }
}