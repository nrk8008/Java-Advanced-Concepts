package ExceptionHandling;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length());
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Generic Exception: " + e.getMessage());
        }
    }
}
