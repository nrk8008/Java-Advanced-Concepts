package InheritancePolimarphism.Inheritance;

public class Student extends User  {
    String batch_name;
    Integer psp;

    public Student(String name, String email, String batch_name, Integer psp) {
        super(name, email);
        this.batch_name = batch_name;
        this.psp = psp;
    }
}
