package InheritancePolimarphism.Inheritance1;

public class Instructor extends User{
    String batchName;
    Double avgRating;
    public void scheduleClass(){
        System.out.println("Scheduling Class");
    }
}
