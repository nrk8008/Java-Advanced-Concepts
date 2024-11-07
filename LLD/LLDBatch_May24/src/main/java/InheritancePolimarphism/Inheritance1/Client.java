package InheritancePolimarphism.Inheritance1;

public class Client {
    public static void main(String[] args) {
        Instructor i = new Instructor();
        i.login();
        i.avgRating = 4.9;
        i.scheduleClass();
    }
}
