import java.util.ArrayList;
import java.util.List;

public class GraduateCourse extends UndergraduateCourse{
    private String researchFocus;

    public GraduateCourse(String courseName, String courseCode,String researchFocus) {
        super(courseName, courseCode);
        this.researchFocus = researchFocus;
    }
    @Override
    public List<Person> getParticipants() {
        return participants;
    }
}
