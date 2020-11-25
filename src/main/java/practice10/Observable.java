package practice10;

public interface Observable {
    public void attached(Observer teacher);

    public void notifyJoined(Student student);

    public void notifyLeader(Student student);
}
