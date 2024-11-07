package ExceptionHandling;

public class CustomExceptionExample {
    public static void main(String[] args) {
        try{
            throw new CustomException("Custom Exception message");
        }catch(CustomException e){
            System.out.println("Caught custom exception" + e.getMessage());
        }
    }
    static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }

}
