package ExceptionHandling;

public class ThrowsExample {
    public static void main(String[] args) {
        try{
            validateAge(35);
        }catch(InvalidAgeException e){
            System.out.println("Error: "+e.getMessage());
        }

    }

    static void validateAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be 18 or Older");
        }
        System.out.println("Valid Age");
    }

}
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
