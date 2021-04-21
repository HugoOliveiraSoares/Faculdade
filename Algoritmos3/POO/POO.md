# Programação Orientada a Objetos
A demanda por software mais poderoso está aumentando, construí-los de maneira rápida, correta e econômica é essencial.

Os objetos ou, mais precisamente, as classes são componentes reutilizáveis.

Quase qualquer substantivo pode ser razoavelmente representado como um objeto de software em termos dos atributos (nome, cor e tamanho) e comportamentos (calcular, mover e comunicar).

Grupos de desenvolvimento se software podem usar um abordagem modular de projeto e implementação orientados a objetos para que sejam  muito mais produtivos do que com as técnicas anteriores como a "programação estruturada".

A orientação a objetos pode ocultar o funcionamento de certas coisas, fazendo uma analogia com o carro, uma pessoa não precisa entender como os mecanismos do acelerador funciona para poder acelerar o carro.

## Métodos e classes
Para realizar uma tarefa em um programa é necessário um **método**.

Uma unidade de programa chamada **classe** para armazenar o conjunto de métodos que executam as tarefas delas.

Por exemplo uma classe de conta bancária poderia conter um método para _fazer depósitos_ de dinheiro, outro para _fazer saques_ e um terceiro para _retornar_ qual é o saldo atual.

## Instanciação
Assim como alguém tem de fabricar um carro a partir dos desenhos de engenharia antes que possa realmente dirigi-lo, você deve construir um objeto de uma classe antes que um programa possa executar as tarefas que o s métodos da classe definem. O processo para fazer isso é chamado instanciação. Um objeto é então referido como uma **instância** da sua classe.

![](/img/Capturadetela.png)

## Reutilização
A reutilização de classes existentes ao construir novas classes e programas economiza tempo e esforço.

Também ajuda a construir sistemas mais confiáveis e eficientes, porque classes e componentes existentes costumam passar por extensos testes, depuração e ajuste de desempenho.

## Mensagens e chamadas de método
Uma **chamada de método** informa a um método do objeto a maneira de realizar sua tarefa. Por exemplo, um programa pode chamar o método _depósito_ de um objeto _conta bancária_ para aumentar ao saldo da conta.

## Atributos e variáveis de instância
Um carro, além de ter a capacidade de realizar tarefas, também tem _atributos_, como cor, número de portas, quantidade de gasolina no tanque velocidade atual e registro da distancia total dirigida, esses atributos são incorporados a ele. Cada carro mantém seus próprios atributos, cada carro sabe a quantidade de gasolina que há no seu tanque, mas desconhece quanto há no tanque de outros carros.

Um objeto, da mesma forma, tem atributos que ele incorpora à medida que é usado em um programa. Esses atributos são especificados como parte da classe do objeto. Os atributos são especificados pelas **variáveis de instancia** da classe.

## Encapsulamento e ocultamento de informações 
Classes (e seus objetos) **encapsulam**, isto é, contêm seus atributos e métodos. Os atributos e métodos de uma classe estão intimamente relacionados. Os objetos podem se comunicar entre si, mas eles em geral não sabem como outros objetos são implementados.

## [Herança](/Herança/Heranca.md)
Uma nova classe pode ser criada através de **herança**, a **subclasse** começa com as características de uma classe existente, chamada **superclasse**, personalizando-as e adicionando aspectos próprios.

## Interfaces
Coleções de métodos relacionados que normalmente permitem informar aos objetos o que fazer, mas não como fazer. 











