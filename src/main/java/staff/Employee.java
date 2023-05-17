package staff;

public abstract class Employee {

    private String name;

    private String nino;

    private int salary;

    public Employee(String name, String nino, int salary) {
        this.name = name;
        this.nino = nino;
        this.salary = salary;
    }

    public String getName() { return name; }

    public String getNino() { return nino; }

    public int getSalary() { return salary; }

    public void raiseSalary(double incrementAmount) {
        salary += incrementAmount;
    }

    public double payBonus(){
        return salary * 0.01;
    }

}
