package InheritancePolimarphism.Inheritance;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student( "Rajesh", "rajesh@gmail.com","June23", 85 );;
        System.out.println(st1.name);
        System.out.println(st1.email);
        System.out.println(st1.batch_name);
        System.out.println(st1.psp);
    }
}
