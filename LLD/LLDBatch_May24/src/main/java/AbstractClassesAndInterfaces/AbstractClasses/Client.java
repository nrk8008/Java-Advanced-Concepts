package AbstractClassesAndInterfaces.AbstractClasses;

public class Client {
    public static void main(String[] args) {
        User user1 = new User("John", "jhon@gmail.com");
        User user2 = new User("Jane", "jane@gmail.com");

        System.out.println(user1.getName() + " " + user1.getEmail());
        System.out.println(user2.getName() + " " + user2.getEmail());

    }
}
