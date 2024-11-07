package AbstractClassesAndInterfaces.Interfaces.MultipleInheritance;

public class Car implements Fly, Transform{

    @Override
    public void fly() {
        System.out.println("Flying Car");
    }

    @Override
    public void transform() {
        System.out.println("Transforming Car");
    }

}
