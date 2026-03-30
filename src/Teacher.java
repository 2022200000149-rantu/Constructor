public class Teacher extends Person {
    private String department;
    private String designation;
    public Teacher () {

    }

    public Teacher (String id, String name, int age, String dateOfBirth, String email, String password,String department, String designation) {
        super(id,name,age,dateOfBirth,email,password);
        this.department = department;
        this.designation = designation;
    }

    public void setDepartment (String department) {
        this.department = department;
    }
    public String getDepartment () {
        return department;
    }

    public void setDesignation (String designation) {
        this.designation = designation;
    }
    public String getDesignation () {
        return designation;
    }

    public void response () {
        IO.println("Hello Students");
    }


}
