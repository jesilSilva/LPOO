Algoritmo "Lista3_EXERCICIO6"
//
//
// Descri��o   : Fa�a um programa que leia v�rios conjuntos de tr�s valores reais
// e mostre para cada conjunto:sua soma, seu produto e sua m�dia.O programa para quando
// um conjunto n�o entrar com seus valores em ordem crescente.
// Autor (a)   : Jesiel Carlos da Silva
// Professor   : Aldo Henrique
// Data atual  : 01/04/2018
Var
   //Declara��es das vari�veis
   numero1,numero2,numero3,soma,produto,media : real

Inicio
   //Orienta��es do programa
   escreval ("Escreva 3 valores em ordem crescente, sen�o o programa encerra ")
   //Solicita��o da digita��o do 1� valor
   escreval("Escreva valor 1:")
   //Leitura o valor informado
   leia(numero1)
   //Solicita��o da digita��o do 2� valor
   escreval("Escreva valor 2:")
   //Leitura o valor informado
   leia(numero2)
   //Solicita��o da digita��o do 3� valor
   escreval("Escreval Valor 3:")
   //Leitura o valor informado
   leia(numero3)
   //Estrutura de repeti��o
   enquanto (numero1 < numero2) e ( numero2 < numero3) e (numero1 < numero3) faca

      //definindo a soma dos n�meros
      soma <- (numero1+numero2+numero3)
      //definindo o produto dos n�meros
      produto <- (numero1*numero2*numero3)
      // definindo a m�dia dos n�meros
      media <- (numero1+numero2+numero3)/3
      // Pular linha
      escreval()
      //Mostrando a soma dos n�meros
      escreval ("A soma dos valores � igual a: ", soma)
      //Mostrando o produto dos n�meros
      escreval ("O produto dos valores � igual a: ", produto)
      //Mostrando a m�dia dos n�meros
      escreval ("A m�dia dos valores � igual a: ", media)
      //Informa��o dos procedimentos a serem feitos
      escreval ("Escreva 3 valores em ordem crescente, sen�o o programa encerra ")
      //Solicita��o da digita��o do 1� valor
      escreval("Escreva valor 1:")
      //Leitura o valor informado
      leia(numero1)
      //Solicita��o da digita��o do 2� valor
      escreval("Escreva valor 2:")
      //Leitura o valor informado
      leia(numero2)
      //Solicita��o da digita��o do 3� valor
      escreval("Escreval Valor 3:")
      //Leitura o valor informado
      leia(numero3)
      //Pular linha
      escreval()
      // Fim da repeti��o
   fimenquanto
   //Pular linha
   escreval()
   //Informa��o do que aconteceu
   escreval("O programa encerrou,pois era preciso informar os n�meros em ordem crescentes!")

Fimalgoritmo