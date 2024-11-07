package StaticLearning;

public class Client {
    public static void main(String[] args) {

        Student s1=new Student();
        Student s2=new Student();

        Student.domainName = "scaler.com";
        Student.univName = "Scaler School";
        Student.dressCode = "Red Blue";
        // before calling the static method.
        System.out.println(s1.domainName);
        System.out.println(s2.domainName);

        Student.changeDomainName("Newscaler.com");
        //After calling the static method.
        System.out.println(s2.domainName);
        System.out.println(s1.domainName);
    }
}
