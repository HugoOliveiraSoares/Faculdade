import Heranca.*;

public class PolymorphismTest {
    public static void main(String[] args) {

        /* Atribuindo referências de superclasse e subclasse a variáveis de superclasse e subclasse */

        // atribui uma referência de superclasse à variavel de superclasse
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);

        // atribui uma referência de subclasse à variável de subclasse
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, 0.4, 300);

        // invoca toString no objeto de superclasse utilizado a variável de superclasse
        System.out.println("\nCall CommissionEmploye's toString with superclass reference to superclass object:\n" + commissionEmployee.toString());

        // invoca toString no objeto de superclasse utilizando a variável de subclasse
        System.out.println("\nCall CommissionEmploye's toString with superclass reference to superclass object:\n" + basePlusCommissionEmployee.toString());

        // invoca toString no objeto de subclasse utilizando a variável de superclasse
        CommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;

        System.out.println("\nCall CommissionEmploye's toString with superclass reference to superclass object:\n" + commissionEmployee2.toString());

    } // fim de main
}
