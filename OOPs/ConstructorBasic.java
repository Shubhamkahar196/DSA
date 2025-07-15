class Test {

    //  default constructor
    public Test(){
       System.out.println("Test constructor called");
    }
    //    creating constructor
    public void printHello(){
        System.out.println("Hello");
    }
}


public class ConstructorBasic {
       
    public static void main(String[] args){
        Test test = new Test();
        test.printHello();
    }
}
