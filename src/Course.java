import java.util.List;

public interface Course {
    public String getCourseName();
    public String getCourseCode();
    public void addParticipant(Person person);
    public List<Person> getParticipants();
}
