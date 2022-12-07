import java.util.Scanner;

public class Salaries {
    public static void main(String[] args) {
    Staff staff = new Staff();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduceti salariul minim pe economie din tara dvoasra in lei:");
    while (!scanner.hasNextInt()) {
        System.out.println("Valoarea introdusa nu este un integer valid. Mai incercati o data:");
    }
    int salariuMinim = scanner.nextInt();

    System.out.println("Introduceti salariul mediu pe economie in tara dvoastra in lei:");
    while (!scanner.hasNextInt()) {
            System.out.println("Valoarea introdusa nu este un integer valid. Mai incercati o data:");
        }
    int salariuMediu = scanner.nextInt();
    int salariulMinimPeOra = salariuMinim / 160;
    int salariulMediuPeOra = salariuMediu / 160;

    staff.addEmployee(new Seller("Alina", "Pop", 45, "1995", salariuMinim));
    staff.addEmployee(new Technician("Leo", "Bob", 28, "2010", salariuMediu));
    staff.addEmployee(new Warehouse("Cosmin", "Uou", 35, "2015", salariulMinimPeOra));
    staff.addEmployee(new TechnicianRisk("Matilda", "Ana", 30, "2009", salariulMediuPeOra));
    staff.addEmployee(new HandlingRisk("Marian", "Coc", 42, "2004", salariulMediuPeOra));

    staff.showSalaries();
        System.out.println("salariul mediu in companie este " + staff.averageSalary());

    }
}