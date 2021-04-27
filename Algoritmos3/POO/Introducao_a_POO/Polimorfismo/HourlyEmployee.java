package Polimorfismo;

public class HourlyEmployee extends Employee {
    
    private double wage; // salário por hora
    private double hours; // horas trabalhadas a semana
    
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        
        if (wage < 0.0)
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");

        if ((hours < 0.0) || (hours > 168.0))
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        
        this.wage = wage;
        this.hours = hours;
    }

    // retorna a remuneração
    public double getWage() {
        return wage;
    }

    // configura a remuneração
    public void setWage(double wage) {
        if (wage < 0.0)
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");

        this.wage = wage;
    }

    // retorna as horas trabalhadas
    public double getHours() {
        return hours;
    }

    // configura as horas trabalhadas
    public void setHours(double hours) {
        if ((hours < 0.0) || (hours > 168.0))
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");

        this.hours = hours;
    }
    
    
    @Override
    public double earnings() {
        
        if (getHours() <= 40)
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
   
    }

    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f", 
            super.toString(), "hourly wage", getWage(),
            "hours worked", getHours());
    }
    
} // fim da classe HourlyEmployee
