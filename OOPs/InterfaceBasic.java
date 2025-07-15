

interface Animal {
    void sound(); // Abstract method (no body)
}

// Class implementing the interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks.");
    }
}


public class InterfaceBasic {
       public static void main(String[] args){
        Dog dg = new Dog();
        dg.sound();
       }
}