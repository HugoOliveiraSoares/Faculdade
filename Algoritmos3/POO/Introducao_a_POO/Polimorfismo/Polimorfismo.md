# Polimorfismo

O Polimorfismo permite "programar no geral" em vez de "programar no _específico_", permite escrever programas que processam objetos que compartilham a mesma superclasse, direta ou indiretamente, como se todos fossem objetos da superclasse; isso pode simplificar a programação.

## Classes e métodos abstratos

O propósito de uma classe abstrata é fornecer uma superclasse apropriada a partir da qual outras classes podem herdar e assim compartilhar um design comun. 

As classes que podem ser utilizadas para instranciar objetos são chamadas _classes concretas_. Essas classes fornecem implementações de cada método que elas declaram (algumas implementações podem ser herdadas).

### Declarando uma classe abstrata e métodos abstratos

Você cria uma classe declarando-a com a palavra ```abstract```. Uma classe abstrata normalmente contém um ou mais _métodos abstratos_. 

```java
public abstract void draw(); // método abstrato
```

**Métodos abstratos não fornecem implementações.**

Os construtores e métodos ```static``` não podem ser declarados ```abstract```. Os contrutores não são herdados portanto um construtor `abstract` nunca seria implementado.

### Usando classes abstratas para declarar variáveis

Embora não seja possível instanciar objetos de superclasses abstratas é possível utilizar superclasses abstratas para declarar variáveis para manipular objetos da subclasse polimorficamente.

## Sistema de folha de pagamento utilizando polimorfismo

> Uma empresa paga seus funcionários semanalmente. Os funcionários são de quatro tipos: funcionários assalariados
recebem salários fixos semanais independentemente do número de horas trabalhadas, funcionários que trabalham por
hora são pagos da mesma forma e recebem horas extras (isto é, 1,5 vez sua taxa de salário por hora) por todas as horas
trabalhadas além das 40 horas normais, funcionários comissionados recebem uma porcentagem sobre suas vendas e
funcionários assalariados/comissionados recebem um salário-base mais uma porcentagem sobre suas vendas. Para o
período salarial atual, a empresa decidiu recompensar os funcionários assalariados/comissionados adicionando 10%
aos seus salários-base. A empresa quer que você escreva um aplicativo que realiza os cálculos da folha de pagamento
polimorficamente.

A superclasse abstrata _Employee_ declara a "interface" para a hierarquia - isto é, o conjunto de métodos que um programa pode invocar em todos os objetos _Empolyee_. 

![Diagrama de classes da UML da hierarquia Employee](/img/Polimorfismo.png)

### Superclasse abstrata [Employee](/Polimorfismo/Employee.java)

Fornece os métodos `earnings` e ToString, além dos métodos `get` que retornam os valores das variáveis de instância _Employee_. O método `earnings` certamente se aplica genericamente a todos os funcionários. Mas cada cálculo dos vencimentos depende da classe específica do funcionário. Assim, declaramos `earnings` como `abstract` na superclasse _Employee_, porque uma implementação padrão especica não faz sentido para esse método.

Cada subclasse sobrescreve `earnings` com uma implementação apropriada. Para calcular os vencimentos de um funcionário, o programa atribui uma referência ao objeto do funcionário a uma variável da superclasse _Employee_ e, então, invoca o método `earnings` nessa variável. Você não pode usar a classe _Employee_ diretamente para criar objetos _Employee_, porque é uma classe abstrata. Por causa da herança todos os objetos de todas as subclasses _Employee_ podem ser pensados como objetos _Employee_.

### Subclasse concreta [SalariedEmployee](/Polimorfismo/SalariedEmployee.java)

A classe _SalariedEmployee_ estende a classe _Employee_ e sobescreve o método _abstrato_ `earnings`, o que torna a classe concreta.

Se não implementamos `earnings`, a classe _SalariedEmployee_ deve ser declarada `abstract` - do contrário, a classe _SalariedEmployee_ não compilará.

### Subclasse concreta [HourlyEmployee](/Polimorfismo/HourlyEmployee.java)

A classe _HourlyEmployee_ também estende _Employee_.

### Subclasse concreta indireta BasePlusCommissionEmployee

A classe _BasePlusCommissionEmployee_ estende a classe _CommissionEmployee_ e, portanto, é uma subclasse indereta da classe _Employee_.

### Processamento polimófico, operador `instanceof` e _downcasting_

Para testar nossa hierarquia _Employee_, o aplicatico ([PayrollSystemTest](/PayrollSystemTest.java)) cria um objeto de cada uma das quatro classes concretas _SalariedEmployee_, _HourlyEmployee_, _CommissionEmployee_ e _BasePlusCommissionEmployee_. O programa manipula esses objetos não polimorficamente, por meio das variáveis do próprio tipo de cada objeto e, então, polimorficamente, utilizando um array de variáveis _Employee_. O programa aumenta o salário base de cada _BasePlusCommissionEmployee_ em 10%.

### Criando o array de Employees

A linha 24 declara `employees` e lhe atribui um array de quatro variáveis _Employee_. Da linha 27 a 30 atribuimos uma referência a cada objeto das subclasses.

```java
employees[0] = salariedEmployee;
employees[1] = hourlyEmployee;
employees[2] = commissionEmployee;
employees[3] = basePlusCommissionEmployee;
```

Essas atribuições são permitidas, porque uma _SalariedEmployee_ é uma _Employee_, uma _HourlyEmployee_ é uma _Employee_, uma _CommissionEmployee_ é uma _Employee_ e uma _BasePlusCommissionEmployee_ é uma _Employee_.

### Processando _Employees_ polimorficamente

As linhas 40 a 51 iteram pelo array employees e invocam os métodos `toString` e `earnings` com a variável _Employee_ _currentEmployee_, cuja referência é atribuída a uma diferente _Employee_ no array em cada iteração.

Todas as chamadas ao método `toString` e `earnings` são resolvidas em tempo de execução, com base no tipo do objeto que _currentEmployee_ referencia. Esse processo é conchecido como **vinculação dinâmica** ou **vinculação tardia**.

### Executando operações do tipo específico em _BasePlusCommissionEmployee_

Realizamos um processamento especial nos objetos _BasePlusCommissionEmployee_ - à medida que encontramos esses objetos em tempo de execução, aumentamos seu salário base em 10%. Ao processar objetos polimorficamente, geralmente não é necessario se preocupar com especificidades, mas para ajustar o salário base temos de determinar o tipo específico de objeto _Employee_ em tempo de execução. A linha 40 utiliza o operador `instanceof` para determinar se um tipo particular do objeto _Employee_ é _BasePlusCommissionEmployee_. A condição é verdadeira se o objeto referenciado por _currentEmployee_ é uma _BasePlusCommissionEmployee_, também seria verdadeiro pra as subclasses de _BasePlusCommissionEmployee_, por causa do relacionamento é um que uma subclasse tem com sua superclasse.