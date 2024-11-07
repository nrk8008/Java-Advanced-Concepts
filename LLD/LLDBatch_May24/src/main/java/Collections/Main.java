package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.addAll(
                List.of(new Student(1,35, "Rajesh kumar", 99),
                        new Student(2,24,"Rakesh",95 ),
                        new Student(3,34, "Ramesh", 86),
                        new Student(4,45,"Raju", 99))
        );

        List<String> strings = new ArrayList<>();
        strings.addAll(
                List.of("Rajesh", "Rakesh", "Ramesh", "Raju")
        );

        Collections.sort(strings);

        Collections.sort(students);

    }


}
