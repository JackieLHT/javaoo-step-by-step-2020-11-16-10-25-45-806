package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id,name, age);
        this.klass = null;
    }

    public Teacher(int id, String name,int age, Klass klass ) {
        super(id,name,age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    public String introduce() {
        String intro = super.introduce() + " I am a Teacher.";
        if(klass != null)
            return intro + " I teach Class " + klass.getNumber() + ".";
        return intro + " I teach No Class.";
    }

    public String introduceWith(Student student) {
        if(student.getKlass().getNumber() == klass.getNumber()) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }
}