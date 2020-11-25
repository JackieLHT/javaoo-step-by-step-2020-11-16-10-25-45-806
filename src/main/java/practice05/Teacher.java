package practice05;

public class Teacher extends Person{
    private Integer klass;

    public Teacher(String name, int age) {
        super(name, age);
        this.klass = null;
    }

    public Teacher(String name,int age, int klass ) {
        super(name,age);
        this.klass = klass;
    }

    public int getKlass() {
        return this.klass;
    }

    public String introduce() {
        String intro = super.introduce() + " I am a Teacher.";
        if(klass != null)
            return intro + " I teach Class " + klass + ".";
        else return intro + " I teach No Class.";
    }
}
