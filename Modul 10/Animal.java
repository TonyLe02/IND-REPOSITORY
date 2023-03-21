public class Animal {
    private String name; // private instansvariabel som holder navnet på dyret
    private int age; // private instansvariabel som holder alderen på dyret

    // konstruktør som tar inn navn og alder og lagrer dem i instansvariablene
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // metode som skriver ut at dyret lager en lyd
    public void makeSound() {
        System.out.println("This animal makes a sound");
    }
}

public class Cat extends Animal {
    // konstruktør som tar inn navn og alder og sender dem videre til superklassens konstruktør
    public Cat(String name, int age) {
        super(name, age);
    }

    // metode som overskriver superklassens makeSound() metode for katten
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("Fluffy", 5); // Oppretter et objekt av Cat-klassen med navn og alder
        myCat.makeSound(); // Kaller makeSound() metoden på objektet og skriver ut "Meow!"
    }
}
