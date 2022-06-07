// Abstract class declaration
abstract class PetAnimal {
    // Abstract method: should be defined in derived class
    public abstract void animalSound();
    // non-abstract method
    public void print() {
        System.out.println("This method is example of abstraction");
    }
}

// Derived class
class Dog extends PetAnimal {
    //abstract method defined here
    public void animalSound() {
        System.out.println("The doggy barks");
    }
}

class MunberThree {
    public static void main(String[] args) {
        Dog doggy = new Dog(); // Instantiate derived class and call methods
        doggy.animalSound();
        doggy.print();
    }
}