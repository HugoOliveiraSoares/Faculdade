package Polimorfismo;

public class SalariedEmployee extends Employee{
    
    private double weekSalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weekSalary) {
        super(firstName, lastName, socialSecurityNumber);

        if (weekSalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");

        this.weekSalary = weekSalary;
    }


    // configura o salário
    public void setWeeklySalary(double weekSalary) {
        if (weekSalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be >= 0.0");

        this.weekSalary = weekSalary;
    }

    // retorna o salário
    public double getWeeklySalary() {
        return weekSalary;
    }

    // calcula os rendimentos; sobrescreve os método earnings em Employee
    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    // retorna a representação String do objeto SalariedEmployee
    @Override
    public String toString() {
        return String.format("salaried employee: %s%n%s: $%,.2f", 
        super.toString(), "weekly salary", getWeeklySalary());
    }

} // fim da classe SalariedEmployee
