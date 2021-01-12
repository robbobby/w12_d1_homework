package Staff;

public class Employee {
    protected String NiNumber;
    protected float salary;
    protected String name;
    public Employee(String niNumber, float salary,String name) {
        this.name = name;
        NiNumber = niNumber;
        this.salary = salary;
    }

    public void setName(String name) {
        if(name.length() > 0)
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return NiNumber;
    }

    public float getSalary() {
        return salary;
    }
    public void raiseSalary(double raise) {
        if(raise > 0)
        this.salary += raise;
    }

    public double getBonus() {
        return this.salary / 100;
    }
}
