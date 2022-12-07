public abstract class Employee {
    protected String firstName; //protected = in pachet si in afara acestuia printr-o clasa COPIL
    protected String lastName;
    protected int age;
    protected String employmentDate;
    protected int reference;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    abstract double calculateSalary();
    abstract String getName();
    Employee(String firstName, String lastName, int age, String employmentDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.employmentDate = employmentDate;
    }
}
