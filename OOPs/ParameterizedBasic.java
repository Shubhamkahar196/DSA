class Test {
    
    // void method 
    public int sum(int num1, int num2){
        return num1 + num2;
    }
}

public class ParameterizedBasic {

     public static void main(String[] args){
            Test test = new Test();
            System.out.println(test.sum(10,20));
     }
}

// Parameterized -> can have any number of arguments