package ExceptionHandling;

public class FinallyBlockExample {
    private static int divide (int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        try{
            System.out.println("Inside try Block");
            int result = divide(10,2);
            System.out.println("Result:"+ result);

        }
        catch(ArithmeticException e){
            System.out.println("Inside catch Block");
            System.out.println("Arithmatic Exception:" + e.getMessage());

        }
        finally{
            System.out.println("Inside finally Block");
        }
    }

}
