package practice10;


import java.util.List;
import java.util.Observable;
import java.util.stream.Collectors;

public class Teacher extends Person implements  Observer {
    private List<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id,name, age);
        this.classes = null;
    }

    public Teacher(int id, String name,int age, List<Klass> classes ) {
        super(id,name,age);
        this.classes = classes;
        for(Klass klass:classes) {
            klass.attached(this);
        }
    }

    public List<Klass> getClasses() {
        return this.classes;
    }

    public String introduce() {
        String intro = super.introduce() + " I am a Teacher.";
        String allClasses = "";
        if(this.classes == null)
        {
            return intro + " I teach No Class.";
        }

        for(Klass klass:classes){
            if (klass!=classes.get(classes.size()-1)) {
                allClasses += klass.getNumber() + ", ";
            }
            else allClasses += klass.getNumber();

        }
        return intro + " I teach Class " + allClasses + ".";
    }

    public String introduceWith(Student student) {
        if(classes.stream().anyMatch(klass -> klass.equals(student.getKlass()))) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public boolean isTeaching(Student student) {
        return classes.stream().anyMatch(klass -> klass.equals(student.getKlass()));
    }

    @Override
    public void updateJoined(Klass klass, Student student) {
        System.out.print(String.format("I am %s. I know %s has joined Class %d.\n",super.getName(),student.getName(),student.getKlass().getNumber()));
    }

    public void updateLeader(Klass klass, Student student) {
        System.out.print(String.format("I am %s. I know %s become Leader of Class %d.\n",super.getName(),student.getName(),student.getKlass().getNumber()));
    }
}