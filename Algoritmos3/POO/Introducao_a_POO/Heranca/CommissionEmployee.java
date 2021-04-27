package Heranca;

/**
 * CommissionEmployee
 * 
 * A classe CommissionEmployee representa um empregado que recebeu um 
 * percentual das vendas brutas
 * 
 */
public class CommissionEmployee{

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    private  double groosSales; //vendas brutas semanais
    private  double commissionRate; // porcentagem da comissão
    

    // construtor de cinco argumentos
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double groosSales, double commissionRate) {
        
        // se grossSales é invalido, lança uma exceção
        if(groosSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        // se commissionRate é inválido, lança uma exceção
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.groosSales = groosSales;
        this.commissionRate = commissionRate;
        
    } // fim do construtor

    // retorna o nome
    public String getFirstName() {
        return firstName;
    }

    // retorna o sobrenome
    public String getLastName() {
        return lastName;
    }

    // retorna o número de seguro social
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // retorna a quantidade de vendas brutas
    public double getGroosSales() {
        return groosSales;
    }

    // configura a quantidade de vendas brutas
    public void setGroosSales(double groosSales) {
        
        // se grossSales é invalido, lança uma exceção
        if (groosSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        this.groosSales = groosSales;
    }


    // retorna a taxa de comissão
    public double getCommissionRate() {
        return commissionRate;
    }

    // configura a taxa de comissão
    public void setCommissionRate(double commissionRate) {
        
        // se commissionRate é inválido, lança uma exceção
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.commissionRate = commissionRate;
    }

    // calcula os lucros
    public double earnings() {
        return commissionRate * groosSales;
    }

    // retorna a representação String do objeto CommissionEmployee
    @Override // indica que esse método substitui um método da superclasse
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
        "commission employee", getFirstName(), getLastName(),
        "social security number", getSocialSecurityNumber(),
        "gross sales", getGroosSales(),
        "commission rate", getCommissionRate() );
    }
    
} // fim da classe CommissionEmployee