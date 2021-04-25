public class Main {
    public static void main(String[] args) {
        
        /* TESTE DA CLASSE CommissionEmployee */

        System.out.println("\n\tTESTE DA CLASSE CommissionEmployee\n");

        // instancia o objeto CommissionEmploye 
        CommissionEmployee employee = new CommissionEmployee(
            "Sue", "Jones", "222-22-2222", 1000, 0.06 );

        // obtém os dados de empregado comissionado
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());

        System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employee.getGroosSales());
        System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());

        employee.setGroosSales(5000);
        employee.setCommissionRate(.1);

        System.out.println("\nUpdated employee information obtained by toString:\n" + employee.toString());

        /* FIM TESTE DA CLASSE CommissionEmployee */


        /* TESTE DA CLASSE BasePlusCommissionEmployee */

        System.out.println("\n\tTESTE DA CLASSE BasePlusCommissionEmployee\n");

        BasePlusCommissionEmployee baseEmployee = 
            new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        // Obtém os dados do empregado comissionado com salário base
        System.out.println("Employee information obtained by get methods:\n");
        System.out.printf("%s %s%n",    "First name is", baseEmployee.getFirstName());
        System.out.printf("%s %s%n",    "Last name is", baseEmployee.getLastName());
        System.out.printf("%s %s%n",   "Social security number is", baseEmployee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", baseEmployee.getGroosSales());
        System.out.printf("%s %.2f%n", "Base salary is", baseEmployee.getBaseSalary());

        baseEmployee.setBaseSalary(1000);

        System.out.println("\nUpdated employee information obtained by toString:\n" + baseEmployee.toString());

        /* FIM TESTE DA CLASSE BasePlusCommissionEmployee */

    } // fim de main
}
