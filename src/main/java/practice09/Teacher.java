package practice09;


import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private List<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id,name, age);
        this.classes = null;
    }

    public Teacher(int id, String name,int age, List<Klass> classes ) {
        super(id,name,age);
        this.classes = classes;
    }

    public List<Klass> getClasses() {
        return this.classes;
    }

    public String introduce() {
        String intro = super.introduce() + " I am a Teacher.";
        String allClasses = "";
        if(this.classes.size() != 0)
        {
            for(Klass klass:classes){
                if (klass!=classes.get(classes.size()-1)) {
                    allClasses += klass.getNumber() + ", ";
                }
                else allClasses += klass.getNumber();

            }
            return intro + " I teach Class " + allClasses + ".";
        }
        return intro + " I teach No Class.";
    }

    public String introduceWith(Student student) {
        if(classes.contains((student.getKlass().getNumber()))) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public boolean isTeaching(Student student) {
        return classes.stream().anyMatch(klass -> klass.equals(student.getKlass()));
    }
}