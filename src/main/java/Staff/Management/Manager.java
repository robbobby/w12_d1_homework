package Staff.Management;

import Staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(String niNumber, float salary, String name, String deptName) {
        super(niNumber, salary, name);
        this.deptName = deptName;
    }
    public String getDeptName() {
        return deptName;
    }
}
