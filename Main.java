package Modul2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Whiskers", 3, "Fish", Gender.FEMALE, Status.ALIVE);
        Dog dog = new Dog("Rex", 5, "Bone", Gender.MALE, Status.ALIVE);
        Duck duck = new Duck("Donald", 2, "Corn", Gender.MALE, Status.DEAD);
        Horse horse = new Horse("Spirit", 7, "Hay", Gender.FEMALE, Status.ALIVE);

        System.out.println(cat.printData());
        System.out.print("Sound: ");
        cat.printSound();
        System.out.println("---------------------");
        System.out.println(dog.printData());
        System.out.print("Sound: ");
        dog.printSound();
        System.out.println("---------------------");
        System.out.println(duck.printData());
        System.out.print("Sound: ");
        dog.printSound();
        System.out.println("---------------------");
        System.out.println(horse.printData());
        System.out.print("Sound: ");
        dog.printSound();
    }
}
