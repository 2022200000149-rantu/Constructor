public class Student extends Person  {
   private String department;
   private String cgpa;

   public Student () {

   }
   public Student (String id, String name, int age, String dateOfBirth, String email, String password,String department, String cgpa) {
       super(id,name,age,dateOfBirth,email,password);
       this.department = department;
       this.cgpa = cgpa;
   }

   public void setDepartment (String department) {
       this.department = department;
   }
   public String getDepartment () {
       return department;
   }

   public void setCgpa () {
       this.cgpa = cgpa;
   }
   public String getCgpa () {return cgpa;}


    public void song () {
        IO.println("Lukiye chile");
    }
}
