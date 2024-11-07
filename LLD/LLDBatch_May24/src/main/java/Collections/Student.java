package Collections;

public class Student implements Comparable<Student> {
    private int id;
    private int age;
    private String name;
    private double psp;
    public Student (int id, int age, String name, double psp) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.psp = psp;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getPsp() {
        return psp;
    }
    // natural ordering for a leaderboard
    @Override
    public int compareTo(Student other) {
        if (this.getPsp() == other.getPsp()) {
            return 0;
        }

        if (this.getPsp() < other.getPsp()) {
            return 1;
        }

        return -1;

    }

}
