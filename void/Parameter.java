package main;
class Animal {
    void bark() {
        String sound = "woof woof";
        System.out.println(sound);
    }
    
    void Running(String animal_type) {
        String action = "The " + animal_type + " is running";
        System.out.println(action);
    }
}

class Parameter {
    public static void main(String[] args) {
        Animal Dog = new Animal();
        Dog.bark();
        Dog.Running("dog");
        
        Animal Cat = new Animal();
        Cat.Running("cat");
    }
}
