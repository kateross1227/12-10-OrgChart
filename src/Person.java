// Super Class to represent a person
public class Person {
  private String nameF;
  private String nameL;
  private int age;
  
  public Person() {
    nameF = "";
    nameL = "";
    age = 0;
  }
  

  
  public Person(String F, String L, int a) {
    nameF = F;
    nameL = L;
    age = a;
  }
  
  public String getFirstName() {
    return nameF;
  }
  
  public String getLastName() {
    return nameL;
  }
  
  public int getAge() {
    return age;
  }
  
  public String toString() {
    return nameL + ", " + nameF;
  }
  
  public void recordBirthday() {
    age++;
  }

  public boolean equals (Object obj) {
    if (obj instanceof Person) {
      Person other = (Person) obj;
      return this.getFirstName() == other.getFirstName() && this.getLastName() == other.getLastName() && this.getAge() == other.getAge();
    }
    else {
      return false;
    }
  }
}
