



abstract class Animal {
    // Abstract method (no implementation)
    abstract void sound();

    // Regular method
    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

// Subclass providing implementation for abstract method
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks.");
    }
}


public class AbstractBasic {
    public static void main(String[] args){
        Dog dg = new Dog();
        dg.sound();
        dg.sleep();
            
        
    }
}
