package InheritancePolimarphism.Polymarphism.MethodOverloading;

public class Client {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "kumar";
        user1.email = "kumar@gmail.com";
        user1.printUser();
        user1.printUser("rajesh", "rajesh@gmail.com");
    }

}
