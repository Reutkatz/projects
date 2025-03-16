public class University {

    //function for display Participants for the accepted course
    public static void displayParticipants(Course course) {
        System.out.println("\nParticipants in " + course.getCourseName() + " (" + course.getCourseCode() + "):");
        for (Person p : course.getParticipants()) {
            System.out.println("- " + p.getName() + " (" + p.getRole() + ")");
        }
    }
    public static void main(String[] args) {
        //create students
        Student student1 = new Student( "12345","Reut" ,20, "12 Trumpeldor St");
        Student student2 = new Student( "67890","Yael",19, "45 Naiman St");

        //create professors
        Professor professor1 = new Professor("Computer Science","Dr. Cohen", 45, "78 Rotshild st" );
        Professor professor2 = new Professor( "Mathematics","Dr. Levi", 50, "1 Yahalom St");

        //create courses
        UndergraduateCourse undergradCourse = new UndergraduateCourse("Programming", "101010");
        GraduateCourse gradCourse = new GraduateCourse("Advanced AI", "50505", "Machine Learning");

        //add students to undergradCourse
        undergradCourse.addParticipant(student1);
        undergradCourse.addParticipant(student2);

        //add proffesors to gradCourse
        gradCourse.addParticipant(professor1);
        gradCourse.addParticipant(professor2);

        //display all Participants for each course
        displayParticipants(undergradCourse);
        displayParticipants(gradCourse);

        //display other function
        System.out.println(student1.study());
        System.out.println(student2.study());
        System.out.println(professor1.teach());
        System.out.println(professor2.teach());
    }
}