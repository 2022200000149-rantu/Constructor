public class Person {
    private String id;
    private String name;
    private int age;
    private String dateOfBirth;
    private String email;
    private String password;
// Constructors
    
        //Default constructor
    public Person () {

    }

        // Parameterised Constructor method
    public Person (String id, String name, int age, String dateOfBirth, String email, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.password = password;
    }

// Setters and Getters 

    public void setId (String id) {
        this.id = id;
    }
    public String getId () {
        return id;
    }

    public void setName (String name) {
        this.name = name;
    }
    public String getName () {
        return name;
    }

    public void setAge (int age) {
        this.age = age;
    }
    public int getAge () {
        return age;
    }

    public void setDateOfBirth (String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getDateOfBirth () {return dateOfBirth ;}

    public void setEmail (String email) {
        this.email = email;
    }
    public String getEmail() {return email;}

    public void setPassword (String password) {
        this.password = password;
    }
    public String getPassword () {return password;}
    
// Method (song)
    public void song () {
        IO.println("Amar hiyar majh a");
    }
}
