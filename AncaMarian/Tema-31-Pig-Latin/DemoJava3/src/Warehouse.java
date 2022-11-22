public class Warehouse extends Employee{

    Warehouse(String firstName, String lastName, int age, String employmentDate, int reference) {
        super(firstName, lastName, age, employmentDate);
        this.reference = reference;
    }

    @Override
    public double calculateSalary() {

        return 65 * reference;
    }

    @Override
    public String getName() {

        return "Angajatul care gestioneaza marfuri se numeste %d %d".formatted(firstName,lastName);
    }
}
