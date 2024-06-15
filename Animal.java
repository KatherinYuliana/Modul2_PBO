package Modul2;

public abstract class Animal implements Sound{
    String name;
    int age;
    String food;
    Gender gender;
    Status alive;

    public Animal(String name, int age, String food, Gender gender, Status alive) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.gender = gender;
        this.alive = alive;
    }

    public boolean isAlive() {
        return this.alive == Status.ALIVE;
    }

    public String printData() {
        return String.format("Name: %s \nAge: %d \nFood: %s \nGender: %s \nAlive: %s \nType: %s",
                this.name, this.age, this.food, 
                this.gender == Gender.MALE ? "Male" : "Female", 
                this.isAlive() ? "Yes" : "No", 
                this.getClass().getSimpleName().toLowerCase());
    }

    @Override
    public void printSound() {

    }
}
