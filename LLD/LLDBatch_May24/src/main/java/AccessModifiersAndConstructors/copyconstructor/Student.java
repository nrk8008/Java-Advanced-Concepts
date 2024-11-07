package AccessModifiersAndConstructors.copyconstructor;

public class Student {

        String name;
        private String email;

        public Student(String name, String email) {
            this.name = name;
            this.email = email;

        }
        // copy constructor
        public Student(Student student) {
            this.name = student.name;
            this.email = student.email;
        }
}
