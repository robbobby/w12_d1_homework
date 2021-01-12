package Staff.Management;

public class Director extends Manager {
    private double budget;

    public Director(String niNumber, float salary, String name, String deptName, double budget) {
        super(niNumber, salary, name, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
    @Override
    public double getBonus() {
        return this.salary / 50;
    }
}
