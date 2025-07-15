// base class
class Vehicle{
     
    String numberOfVehicle;

    public Vehicle(String numberofVehicle){
        this.numberOfVehicle = numberofVehicle;
    }

    public void honk(){
        System.out.println("Honk!!!!!!!!");
    }

    public void printNumberOfVehicle(){
        System.out.println(numberOfVehicle);
    }
}

// derived class
class Car extends Vehicle {
  

    public Car(String numberOfCar){
       super(numberOfCar);
    }

   


}

class Bus extends Vehicle {
   

    public Bus(String numberOfBus){
        super(numberOfBus);
    }

   

   


}



public class InheritenceBasic {
    public static void main(String[] args){
          Car car = new Car("KAr4ff");
          car.printNumberOfVehicle();
          car.honk();

       
          Bus bus = new Bus("12Ger");
          bus.printNumberOfVehicle();
          bus.honk();

    }
    
}
