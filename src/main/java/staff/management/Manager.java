package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String nino, int salary, String deptName) {
        super(name, nino, salary);
        this.deptName = deptName;
    }

    public String getDeptName() { return deptName; }
}
