// main program to drive org chart
public class OrgChart {
  public static void main(String[] args) {
    Manager m1 = new Manager("Flickerman", "Caesar", 5, 52.0, 4, "Development Manager", "HG");
    Manager m2 = new Manager("Heavensbee", "Plutarch", 3, 25.0, 40, "Development Manager", "HG 2.0");
    Employee e1 = new Employee("Mellark", "Peeta", 15, 21.0, 5, "SR Developer");
    e1.setManager(m1);
    Employee e2 = new Employee("Everdeen", "Katniss", 19, 61.0, 3, "JR Developer");
    e1.setManager(m1);
    Employee e3 = new Employee("Odair", "Finnick", 4, 100.0, 24, "JR Developer");
    e3.setManager(m1);
    e3.setManager(m2);
    System.out.println(m1.toString() + "\n\t" + e1.toString() + "\n\t" + e2.toString());
    System.out.println(m2.toString() + "\n\t" + e3.toString());
    
    printInfo(Person());
    
  }
  
    public static void printInfo(Person p) {
      if (p instanceof Manager) {
        Manager m = (Manager) p;
        System.out.println("Manager: " + m.getLastName() + ", " + m.getFirstName());
        System.out.println("\tAge:" + m.getAge() + "Job Title: " + m.getJobTitle());
        System.out.println("\t\tYearly Salary: $" + m.getYearlySalary());
      }
      else if (p instanceof Employee) {
        Employee e = (Employee) p;
        System.out.println("Employee: " + e.getLastName() + ", " + e.getFirstName());
        System.out.println("\tAge:" + e.getAge() + "Job Title: " + e.getJobTitle());
        System.out.println("\t\tYearly Salary: $" + e.getYearlySalary());
      }
      else {
        System.out.println("Person: " + p.getLastName() + ", " + p.getFirstName());
        System.out.println("\tAge:" + p.getAge());
      }
    }
}
