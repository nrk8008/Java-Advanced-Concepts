package AccessModifiersAndConstructors.copyconstructor;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student("Prateek", " Prateek@gmail.com");
        System.out.println(st1.name);
        Student st2 = new Student("Rajesh", "Rajesh@gmail.com");
        System.out.println(st2.name);
    }
}
