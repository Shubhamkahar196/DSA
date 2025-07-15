

// define class

class Test {

    int age;
        //    void method
    public  void assignAge(int num){
        age=num;
    }
}



public class basic {


    // access specifiers
    private static void print(){
        System.out.println("Private called");
    }
       public static void main(String[] args){
         print();
        // we call it static without creating object
        // Test.printTest();   
      
        // creating object
        Test test1 = new Test();
        test1.assignAge(10);

        Test test2 = new Test();
        test2.assignAge(19);

        System.err.println(test1.age);
        System.err.println(test2.age);

       }
}


// Access specifiers
// public -> everywhere
// private -> current class
// protected-> current package and all other sub packages