package Gucci;
import java.util.Scanner;
public class carMood {
    public static void main(String[] args) {
        char carMood = 'D';
        String parkingType = "Paralle";
        String driveType = "Snow";
       switch (carMood) {
           case 'P' :
               System.out.println("You can park");
               if (parkingType.equals("Parallel")) {
                   System.out.println("You can park between cars");
               }else {
                   System.out.println("You can park somewhere else");
               }
               break;
           case  'D':
               System.out.println("You can drive your car");
               if (driveType.equals("Snow type")); {
                   System.out.println("You can put Snow type drive");
                   if (driveType.equals("Sport")) {
                       System.out.println("You can put sport type");
                       if (driveType.equals("Regular")){
                           System.out.println("You can drive reqular type");
                       }else
                           System.out.println("invalid drive type");
                   }
               }
               break;
           case 'N':
               System.out.println("You can put your car in car wash ");
               break;
           case 'R':
               System.out.println("You can reverse you car");
           default:
               System.out.println("invalid mode type, please check your car mode");
       }
        //ble to put car on P mode, D mode, N mode, R mode
          //      * If i am on P mode and parking type is parallel then i can park between two cars
         //       * If i am on D mode I can put drive type to Snow type, Sport Type or Regular type
 //* If i am on N mode i can put car in car wash station
 //* If i am on R mode I can only reverse the car and car will activate back camera
 //* If mode is incorrect then print me invalid mode type, please check your car mode

    }
}
