package Composition;

public class SchoolMain {
    public static void main(String[] args) {
        Student student = new Student("John Mark", 16);
        School school = new School(student, "Lagos");
    }
}
