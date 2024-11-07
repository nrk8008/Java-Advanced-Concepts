package LearningInheritance;

public class Instructor extends User {

    // Instructor is a child class will have all the attributes of User clas."Inheritance"

    String batchName;
    double avgRating;

    void scheduleClass(){
        System.out.println("Scheduling_a_Class");
    }
}
