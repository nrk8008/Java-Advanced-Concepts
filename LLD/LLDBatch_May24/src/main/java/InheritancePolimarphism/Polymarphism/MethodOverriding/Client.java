package InheritancePolimarphism.Polymarphism.MethodOverriding;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Rajesh";
        st1.email = "rajesh@gmail.com";
        st1.batchName = "June 2023";
        st1.psp = 85;

        st1.printUser();
        
    }
}
