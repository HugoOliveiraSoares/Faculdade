algoritmo "Ex2C4"
// Autor(a)    : Hugo Oliveira Soares
// Data atual  : 3/3/2020
var nome, nomeEmpresa : caracter
    CPF, identidade, tituloEleitor, carteiraMotorista : caracter
    salario : real


Inicio

    escreva("Digite o seu nome: ")
    leia(nome)
    escreva("Digite o seu CPF: ")
    leia(CPF)
    escreva("Digite a sua Identidade: ")
    leia(identidade)
    escreva("Digite o seu Titulo de eleitor: ")
    leia(tituloEleitor)
    escreva("Digite a sua Carteira de Motorista: ")
    leia(carteiraMotorista)
    escreva("Digite o seu Salário: ")
    leia(salario)
    escreva("Digite o nome da Empresa em que trabalha: ")
    leia(nomeEmpresa)

    limpatela

    escreval("FICHA FUNCIONAL DE:", nome)
    escreval
    escreval("Documentos:")
    escreval("CPF...................... ", CPF)
    escreval("C.I...................... ", identidade)
    escreval("Titulo de eleitor........ ", tituloEleitor)
    escreval("Carteira de Motorista.... ", carteiraMotorista)
    escreval
    escreval("Empresa: ", nomeEmpresa)
    escreval("Salário: R$", salario)


Fimalgoritmo