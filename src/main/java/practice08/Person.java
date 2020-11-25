package practice08;

public class Person {
    private int id;
    private String name;
    private int age;
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return  String.format("My name is %s. I am %d years old.",name,age);
    }

    public boolean equals(Object obj) {
        Person person = (Person) obj;
        if(obj == null)
        {
            return false;
        }
        if(this.id == person.id)
        {
            return true;
        }
        return false;
    }
}