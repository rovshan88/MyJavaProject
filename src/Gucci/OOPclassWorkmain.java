package Gucci;

public class OOPclassWorkmain {
    public static void main(String[] args) {
        Mammal human = new Mammal();
        Mammal octopus = new Mammal();
        Mammal dog = new Mammal();
        System.out.println("human has "+ human.hands + " hands");
        System.out.println("dog has" + dog.legs+ "legs");
        octopus.hands = 8;
        octopus.hair = "black";

    }
}
