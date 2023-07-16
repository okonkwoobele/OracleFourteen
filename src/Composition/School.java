package Composition;

public class School {
    private Student student;
    private  String address;

    public School(Student student, String address) {
        this.student = student;
        this.address = address;
    }
}
