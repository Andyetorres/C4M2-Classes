public class Person{
    
    //Atributos
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;


    //Contructors
    //Constructores que delegan el trabajo al siguiente
    public Person() {
        this("Andy","Torres");
    }
 
    public Person(String firstName, String lastName) {
        this(firstName,lastName,"andy.torres@email.com","626734763");      
    }

    public Person(String firstName, String lastName, String email) {
        this(firstName,lastName,email,"626734763");
    }

    //Constructor que hace el trabajo
    public Person(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getter

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    // Setter

    public void setEmail(String email) {
    this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }    
    
    public String toString(){
        return String.format("Person: fullname=%s %s, email=%s, phone=%s",firstName,lastName,email,phoneNumber);
    }
    
}
