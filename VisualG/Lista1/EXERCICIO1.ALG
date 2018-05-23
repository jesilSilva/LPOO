Algoritmo "Lista1_Exercicio1"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21/04/2018
Var
   // Seção de Declarações das variáveis
   numero1,numero2,soma,produto,diferenca:inteiro
   media:real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Entre o primeiro número:")
   leia(numero1)
   escreva("Entre o segundo número:")
   leia(numero2)

   soma<- (numero1+numero2)
   diferenca<-(numero1-numero2)
   produto<-(numero1*numero2)
   media<-(numero1+numero2)/2

   escreval("Soma:",soma)
   escreval("Diferença:",diferenca)
   escreval("Produto:",produto)
   escreval("Media:",media)

Fimalgoritmo