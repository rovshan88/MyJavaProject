package Gucci;

public class arrays {
    public static void main(String[] args) {
        int[] numArray = {4, 21, 55, 7, 32};
        int lenArray = numArray.length;
        //Adding all numbers of array without using for-loops
        double arrayTotal = numArray[lenArray-5]+numArray[lenArray-4]+numArray[lenArray-3]+numArray[lenArray-2]+numArray[lenArray-1];
        //above code is same as -> double arrayTotal = numArray[0]+numArray[1]+numArray[2]+numArray[3]+numArray[4];
        double avgArray = arrayTotal/lenArray;
        if (avgArray > 25) {
            System.out.println("Print from index 0 to last -> " +
                    numArray[lenArray-5] + ", " + numArray[lenArray-4] + ", " +
                    numArray[lenArray-3] + ", " + numArray[lenArray-2] + ", " +
                    numArray[lenArray-1]);
        } else {
            System.out.println("Print from index last to 0 -> " +
                    numArray[lenArray-1] + ", " + numArray[lenArray-2] + ", " +
                    numArray[lenArray-3] + ", " + numArray[lenArray-4] + ", " +
                    numArray[lenArray-5]);
        }

    }
}
