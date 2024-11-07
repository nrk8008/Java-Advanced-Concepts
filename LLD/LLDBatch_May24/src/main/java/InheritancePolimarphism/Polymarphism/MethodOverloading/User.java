package InheritancePolimarphism.Polymarphism.MethodOverloading;

public class User {
    String name;
    String email;

    public void printUser(){
        System.out.println("Name: " + name + " Email: " + email);

    }
    public void printUser(String name, String email) {

        System.out.println("Name: " + name + " Email: " + email);
    }
}
