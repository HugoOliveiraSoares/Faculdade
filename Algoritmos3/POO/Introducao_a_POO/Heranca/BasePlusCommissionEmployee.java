// A classe BasePlusCommissionEmployee é herdada de CommissionEmployee
// e acessa os dados private da superclasse via métodos public herdados.

public class BasePlusCommissionEmployee extends CommissionEmployee {
    
    private double baseSalary; // salário base por semana

    // construtor de seis argumentos
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double groosSales, double commissionRate, double baseSalary) {

        // chamada explícita para o construtor CommissionEmployee da superclasse
        super(firstName, lastName, socialSecurityNumber, groosSales, commissionRate);

        // se baseSalary é inválido, lança uma exceção
        if (baseSalary < 0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");

        this.baseSalary = baseSalary;
    }

    // retorna o salário base
    public double getBaseSalary() {
        return baseSalary;
    }

    // configura o salário base
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }


    // calcula os lucros
    @Override // inddica que esse método substitui um método da superclasse
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    // retorna a representação de String de BasePlusCommissionEmployee
    @Override // indica que esse método substitui um método da superclasse
    public String toString() {
        // Retorna erro pois o atributos da superclasse são privados
        // return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
        //     "base salaried commission employee", firstName, lastName,
        //     "social security number", socialSecurityNumber,
        //     "gross sales", groosSales, "commission rate", commissionRate,
        //     "base salary", baseSalary);

        return String.format("%s %s%n%s: %.2f", "base salaried" , 
            super.toString(), "base salary", getBaseSalary());

    }
}
