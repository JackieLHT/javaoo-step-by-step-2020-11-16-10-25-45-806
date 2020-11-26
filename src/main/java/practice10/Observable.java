package practice10;

public interface Observable {

    void attached(Observer teacher);

    void notifyJoined(Student student);

    void notifyLeader(Student student);
}
