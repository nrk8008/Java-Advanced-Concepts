package ExceptionHandling;

public class UncheckedExceptionExample {
    private static int divide(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {

        try{
            int result = divide(10, 0);
            System.out.println("Result"+ result);

        }catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());

        }
    }
}
