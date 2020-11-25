package practice08;

import java.util.LinkedList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> studentList;

    public Klass(int number) {
        this.number = number;
        this.studentList = new LinkedList<>();
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        if(!studentList.contains(student))
        {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = student;
        student.introduce();
    }

    public void appendMember(Student student) {
        if(!studentList.contains(student)) {
            studentList.add(student);
        }
    }
}
