package AccessModifiersAndConstructors;

public class Client {
    public static void main(String[] args) {

        Student st1 = new Student("prateek", "prateek@gmail.com");
        System.out.println(st1.name);
        Student st2 = new Student("Rahul", "Rahul@gmail.com");
        System.out.println(st2.name);
    }
}
