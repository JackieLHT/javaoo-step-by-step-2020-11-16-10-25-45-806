package practice10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Klass implements Observable{
    private int number;
    private Student leader;
    private List<Student> studentList;
    private List<Observer> teachers = new ArrayList<>();

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
        if(student.getKlass().getNumber() != number)
        {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = student;
        student.introduce();
        notifyLeader(student);
    }

    public void appendMember(Student student) {
        if(!isIn(student))
        {
            studentList.add(student);
            notifyJoined(student);
        }
    }

    public boolean isIn(Student student) {
        return studentList.contains(student);
    }

    @Override
    public void attached(Observer teacher) {
        teachers.add(teacher);
    }

    @Override
    public void notifyJoined(Klass klass,Student student) {
        for (Observer teacher : teachers) {
            teacher.updateJoined(this ,student);
        }
    }

    public void notifyLeader(Klass klass,Student student) {
        for (Observer teacher : teachers) {
            teacher.updateLeader(this, student);
        }
    }
}
