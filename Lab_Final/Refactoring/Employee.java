abstract class Employee{
    private int type;
    private double monthlySalary;
    private double commission;
    private double bonus;
    public Employee(int type,double salary,double commission,double bonus){
        this.type=type;
        this.monthlySalary=salary;
        this.commission=commission;
        this.bonus=bonus;
    }
    public abstract  double payAmount();
}