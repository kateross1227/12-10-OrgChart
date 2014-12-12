// class to represent a manager - inherits Emplyee
import java.util.*;

public class Manager extends Employee {
  private String department;
  private ArrayList<Employee> directReports;
  
  public Manager(String nameF, String nameL, int age, double hWage, int hWorked, String jTitle, String dept){
    super(nameF, nameL, age, hWage, hWorked, jTitle);
    department = dept;
  }
  public String getDepartment() {
    return department;
  }
  
  public ArrayList<Employee> getDirectReports() {
    return directReports;
  }
  
  public String toString() {
    return "Manager: " + super.toString();
  }
  
  public void addDirectReport(Employee employee) {
    directReports.add(employee);
  }
  
  public void removeDirectReport(Employee employee) {
    directReports.remove(employee);
  }
  
  public void setDepartment(String dept) {
    department = dept;
  }
}
