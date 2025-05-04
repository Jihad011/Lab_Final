class Manager extends Employee{
    private int type;
    private double monthlySalary;
    private double commission;
    private double bonus;
    public Manager(int type,double salary,double commission,double bonus){
        super(type,salary,commission,bonus);
        this.type=type;
        this.monthlySalary=salary;
        this.commission=commission;
        this.bonus=bonus;
    }
    @Override
    public  double payAmount(){
        return this.monthlySalary+this.bonus;
    }
}