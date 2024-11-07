package AbstractClassesAndInterfaces.Interfaces;

public class User implements Person{

    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

}
