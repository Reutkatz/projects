public class Student extends Person {

    private String studentID;
    public Student(String studentID,String name, int age, String address) {
        super(name, age, address);
        this.studentID=studentID;
    }

    @Override
    public String getRole() {
        return "Student";
    }
    public String study(){
        return getName() + " is studying!";
    }
}
