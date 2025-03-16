public class Professor extends Person {
    private String department;

    public Professor(String department,String name, int age, String address) {
        super(name, age, address);
        this.department = department;
    }

    @Override
    public String getRole() {
        return "Professor";
    }
    public String teach() {
        return "Professor " + getName() + " is teaching in the " + department + " department.";
    }
}
