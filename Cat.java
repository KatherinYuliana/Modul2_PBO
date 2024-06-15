package Modul2;

public class Cat extends Animal{
    public Cat(String name, int age, String food, Gender gender, Status alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    public void printSound() {
        System.out.println("Meow");
    }
}
