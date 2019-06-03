package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increment){
      if (!(increment < 0)) {
          this.salary += increment;
      }
    }

    public double payBonus(){
        return this.salary/100;
    }

    public void setName(String newName){
        if (!(newName.equals(""))) {
            this.name = newName;
        }
    }
}
