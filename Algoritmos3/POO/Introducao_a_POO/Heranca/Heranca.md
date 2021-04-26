# Herança 
Uma classe é criada adquirindo os membros de uma classe existente e, possivelmente, aprimorando-os com capacidades novas ou modificadas. 

Ao criar uma classe, em vez de declarar membros completamente novos, você pode designar que a nova classe, chamada de **subclasse**, deva _herdar_ membros de uma classe existente, que é chamada de **superclasse**. Uma subclasse pode se tornar uma superclasse para futuras subclasses.

Uma subclasse pode adicionar seus próprios campos e métodos portanto ela é mais _específica_ que sua superclasse e representa um grupo especializado de objetos.

Distiguimos entre o relacionamento "é um" e o relacionamento "tem um", em que "é um" representa a herança, em um relacionamento "é um", um objeto de uma subclasse também pode ser tratado como um objeto da superclasse - por exemplo, um carro é um veículo, por contraste, "tem um" indica a composição; em um relacionamento "tem um", um objeto contém referências como membros a outros objetos - por exemplo, um carro tem um volante (um objeto carro tem uma referência a um objeto volante).

## Superclasses e subclasses
![Exemplos de herança](/img/SuperClasse_Subclasses.png)

Cada objeto de subclasse é um objeto de sua superclasse, e uma superclasse pode ter muitas subclasses, representando um conjunto muito grande de objetos.

### Hierarquia de membros de uma comunidade universitária

Relacionamentos de herança formam estruturas _hierárquicas_ na forma de árvores. 

Uma comunidade universitária tem milhares de membros, incluindo empregados, alunos e graduados. Os empregados incluem o corpo docente e os funcionários operacionais. Os membros da faculdade são administradores (como diretores e chefes de departamento) ou professores. A hierarquia pode conter muitas outras classes.

![Diagrama de classes UML da hierarquia de herança para CommunityMembers universitários](/img/HerancaCommunityMembers.png)

## Membros protected

Os membros _protected_ de uma superclasse podem ser acessados por membros dessa superclasse, de suas subclasses e de outras classes no _mesmo pacote_.

Membros _private_ de uma superclasse não são acessíveis fora da própria classe. Só podem ser acessados por meio dos métodos _public_ ou _protected_ herdados da superclasse.

Quando um método de subclasse _sobrescrever_ um método de superclasse herdado, a versão superclasse do método pode ser acesada a partir da subclasse, com a palavra-chave **super**.

## Relacionamento entre superclasses e subclasses.

Temos um aplicativo de folha de pagamento que contém tipos de empregados.

Nessa empresa, os empregados comissionados (que serão representados como objetos de uma superclasse) recebem uma porcentagem de suas vendas, enquanto empregados comissionados com salário base (que serão representados como objetos de uma subclasse) recebem um salário base mais uma porcentagem de suas vendas.

A primeira classe,  _[CommissionEmployee](CommissionEmployee.java)_, declara variáveis de instância _private_: nome, sobrenome, número de seguro social, taxa de comissão e quantidade de vendas brutas.

A segunda classe, _BasePlusCommissionEmployee_ que _amplia_ a classe _CommissionEmployee_ (isto é, uma _BasePlusCommossionEmployee_ é uma CommissionEmployee que também tem um salário base). Essa reutilização de software permite escrever muito menos código ao desenvolver a nova subclasse.

### Construtor da classe CommissionEmployee

Os construtores não são herdados, então a classe CommissionEmployee não herda o construtor da classe _Object_. Mas os construtores de uma superclasse continuam disponíveis para serem chamados pelas subclasses.

As linhas 22 e 23, 26 a 28 validam os argumentos _grossSales_ e _commissionRate_, se forem válidos as linhas 33 e 34 atribuem os argumentos do construtor às variáveis de instância da classe.

### O método earnings da classe CommissionEmployee

O método earnings calcula os vencimentos de uma _CommissionEmployee_, multiplica ```commissionRate``` com ```grossSales````e retorna o resultado.

### Anotação @Override e o método toString da classe CommissionEmployee

O ```toString``` é especial - é um dos métodos que toda classe herda direta ou indiretamente da classe _Object_. 
O método retorna uma ```String``` que representa um objeto, ele é chamado implicitamente (dependento da IDE usada) sempre que um objeto deve ser convertido em uma representação ```String```, como quando é impresso pelo método ```printf```

A linha 91 usa a **anotação ```Overrride```** opcional para indicar que a seguinte declaração deve _sobrescrever_ um método da superclasse existente.

A anotação ajuda o compilador a capturar alguns erros comuns. Por exemplo, erros de digitação (lembrando que a linguagem é case sensitive então maiúsculas e minúsculas também contam), o compilador o sinalizará como um erro. Outro erro é declarar o número ou tipos errados na lista de parâmetros. Isso cria uma _sobrecarga_ não intencional do método da superclasse, em vez de sobrescrever o método existente.

### Criando uma hierarquia de herança CommissionEmployee-BasePlusCommissionEmployee

Declaramos a classe _BasePlusCommissionEmployee_, que amplia a classe _CommissionEmployee_.

A palavra chave ```extends``` indica a herança, fazendo que _BasePlusCommissionEmployee_ herde as variáveis de instância e os métodos de _CommissionEmployee_. Somente os membros _public_ e _protected_ são diretamente acessíveis na subclasse.

#### Observações sobre a utilização de variáveis de instância _protected_

Neste exemplo, declaramos as variáveis de instância de superclasse como _protected_ para que as subclasses pudessem acessá-las. Herdar as variáveis de instância _protected_ permite acesso direto a elas por meio de subclasses. Na maioria dos casos é melhor usar as variáveis de instância _private_ para incentivar a engenharia de software adequada.

Um dos problemas do _protected_ é que o objeto de sublasse pode configurar o valor de uma variável herdada diretamente sem utilizar um método _set_, podendo atribuir um valor inválido à variável. Por exemplo a classe BasePlusCommissionEmployee poderia atribuir um valor negativo a ```groosSales```.

A boa prática de engenharia de software seria deixar os atributos privados e acessá-los e modificá-los a partir do métodos públicos, os _geters_ e _seters_.