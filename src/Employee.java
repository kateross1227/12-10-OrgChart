// class to represent an emplayee - inherits Person
public class Employee extends Person {
  private double hourlyWage;
  private int hoursWorked;
  private String jobTitle;
  private Manager manager;
  
  public Employee(String nameF, String nameL, int age, double hWage, int hWorked, String jTitle) {
    super(nameF, nameL, age);
    hourlyWage = hWage;
    hoursWorked = hWorked;
    jobTitle = jTitle;
  }
  
  public double getWage() {
    return hourlyWage;
  }
  
  public int getHours() {
    return hoursWorked;
  }
  
  public double getWeeklySalary() {
    return hourlyWage * hoursWorked;
  }
  
  public double getYearlySalary() {
    return getWeeklySalary() * 52;
  }
  
  public String getJobTitle() {
    return jobTitle;
  }
  
  public String toString() {
    return super.toString() + ": " + jobTitle + " @ $" + getYearlySalary();
  }
  
  public void setWage(double newWage) {
    hourlyWage = newWage;
  }
  
  public void setHours(int h) {
    hoursWorked = h;
  }
  
  public void setJobTitle(String title) {
    jobTitle = title;
  }
  
  public void giveRaise() {
    hourlyWage ++;
  }
  
  public void setManager(Manager newManager) {
    manager = newManager;
  }
  
  public boolean equals (Object obj) {
    if (obj instanceof Employee) {
      Employee other = (Employee) obj;
      return this.getFirstName() == other.getFirstName() && this.getLastName() == other.getLastName() && this.getAge() == other.getAge() && this.getWage() == other.getWage() && this.getHours() == other.getHours() && this.getJobTitle() == other.getJobTitle(); 
    }
    else {
      return false;
    }
  }
}
