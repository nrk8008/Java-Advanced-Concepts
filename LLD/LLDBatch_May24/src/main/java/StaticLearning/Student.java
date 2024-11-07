package StaticLearning;

public class Student {
    String name;
    int age;
    String email;
    String address;
    double psp;

    static String univName;
    static String dressCode;
    static String domainName;

    static void changeDomainName(String newdomainName) {
        domainName = newdomainName;

    }
}
