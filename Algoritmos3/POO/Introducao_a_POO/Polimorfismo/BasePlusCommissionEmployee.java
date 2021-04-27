package Polimorfismo;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    
    private double baseSalary; // salário de base por semana

    // construtor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if (baseSalary < 0.0) // valida baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    // retorna o salário base
    public double getBaseSalary() {
        return baseSalary;
    }

    // configura o salario base
    public void setBaseSalary(double baseSalary) {

        if (baseSalary < 0.0) // valida baseSalary
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    // calcula os vencimentos; sobrescreve o método earnings em CommissionEmployee
    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    // retorna a representação String do objeto BasePlusCommissionEmployee
    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f", "base-salaried",
            super.toString(), 
            "base salary", getBaseSalary());
    }

} // fim da classe BasePlusCommissionEmployee
