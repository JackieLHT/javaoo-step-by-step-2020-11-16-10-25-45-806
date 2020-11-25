package practice05;

public class Student extends Person {
    private Integer klass;
    public Student(String name,int age, int klass ) {
        super(name,age);
        this.klass = klass;
    }

    public int getKlass() {
        return this.klass;
    }

    public String introduce() {
        return super.introduce() + " I am a Student. I am at Class " + klass +".";
    }


}
