package Polimorfismo;

public class CommissionEmployee extends Employee {
    
    private double grossSales; // vendas brutas semanais
    private double commissionRate; // porcentagem da comissão
    
    // construtor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
            double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);

        if (commissionRate <= 0.0 || commissionRate >= 1.0) // valida
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        
        if (grossSales < 0.0) // valida
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    // retorna a quantidade de vendas brutas
    public double getGrossSales() {
        return grossSales;
    }

    // configura a quantidade de vendas brutas
    public void setGrossSales(double grossSales) {
        
        if (grossSales < 0.0) // valida
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        this.grossSales = grossSales;
    }

    // retorna a taxa de comissão
    public double getCommissionRate() {
        return commissionRate;
    }

    // configura a taxa de comissão
    public void setCommissionRate(double commissionRate) {

        if (commissionRate <= 0.0 || commissionRate >= 1.0) // valida
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        this.commissionRate = commissionRate;
    }

    // calcula os rendimentos; sobrescreve o método earnings em Employee
    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
            "commission employee", super.toString(), "gross sales",
            getGrossSales(), "commission rate", getCommissionRate());
    }

}
