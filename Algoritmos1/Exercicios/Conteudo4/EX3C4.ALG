algoritmo "Ex3C4"
//  
// Autor(a)    : Hugo Oliveira Soares
// Data atual  : 4/3/2020
var Quantpoluente, QuantpoluenteMax : inteiro
	multa, multaMaxima, multaEmit : real
	
Inicio
escreva("Digite a quantidade de poluente emitido: ")
leia(Quantpoluente)
escreva("Digite a quantidade de poluente maxima: ")
leia(QuantpoluenteMax)
escreva("Digite o preço da multa: ")
leia(multa)
escreva("Digite o preço da multa maxima: ")
leia(multaMaxima)
escreva("Digite a multa por poluente emitido: ")
leia(multaEmit)

limpatela

escreval("===============================================================")
escreval("	Quantidade de Poluente Emitido x Valor da multa 	")
escreval("---------------------------------------------------------------")
escreval("  Até ", Quantpoluente, " multa de R$", multa)
escreval("---------------------------------------------------------------")
escreval("  Entre ", Quantpoluente, " e ", QuantpoluenteMax, " multa de R$", multaMaxima)
escreval("---------------------------------------------------------------")
escreval("  Acima de ", QuantpoluenteMax, " multa de R$", multaEmit, " por poluente Emitido")
escreval("===============================================================")

Fimalgoritmo