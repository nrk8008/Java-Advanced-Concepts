package LearningInheritance;

public class Client {

    public static void main(String[] args) {

        User user1 = new User();
        user1.userName = "Rajesh";
        user1.email = "rajesh@gmail.com";
        user1.name = "Rajesh kumar";

        Instructor i1 = new Instructor();

        i1.userName = "Rajesh Kumar";
        i1.email = "kumar@gmail.com";
        i1.name = "Rajesh Kumar";
        i1.avgRating = 4.89;
        i1.batchName = "Batch 1";
        i1.scheduleClass();


    }
}
