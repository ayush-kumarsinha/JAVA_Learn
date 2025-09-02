//55. Create a class Animal with a method makeSound(). Create a subclass Dog that overrides makeSound() and prints
//"Bark!". (inheritance)
class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}
