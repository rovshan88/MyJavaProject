package Gucci;

public class EnhanceLoop {
    public static void main(String[] args) {
//        int [] numbers = {10,20,30,40,50};
//        for (int i = 0; i< numbers.length; i++){
//            System.out.println("element: " + numbers [i]);
//        }
        String[] names = {"James","Larry","Tom","Lacy"};

        for (String name : names) {
            System.out.println(name);
            boolean isJames = name.equals("James");
            if (isJames == true) {
                System.out.println("james is here");
                break;
            }
        }

    }

}
