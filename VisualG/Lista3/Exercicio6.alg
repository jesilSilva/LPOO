Algoritmo "Lista3_EXERCICIO6"
//
//
// Descrição   : Faça um programa que leia vários conjuntos de três valores reais
// e mostre para cada conjunto:sua soma, seu produto e sua média.O programa para quando
// um conjunto não entrar com seus valores em ordem crescente.
// Autor (a)   : Jesiel Carlos da Silva
// Professor   : Aldo Henrique
// Data atual  : 01/04/2018
Var
   //Declarações das variáveis
   numero1,numero2,numero3,soma,produto,media : real

Inicio
   //Orientações do programa
   escreval ("Escreva 3 valores em ordem crescente, senão o programa encerra ")
   //Solicitação da digitação do 1° valor
   escreval("Escreva valor 1:")
   //Leitura o valor informado
   leia(numero1)
   //Solicitação da digitação do 2° valor
   escreval("Escreva valor 2:")
   //Leitura o valor informado
   leia(numero2)
   //Solicitação da digitação do 3° valor
   escreval("Escreval Valor 3:")
   //Leitura o valor informado
   leia(numero3)
   //Estrutura de repetição
   enquanto (numero1 < numero2) e ( numero2 < numero3) e (numero1 < numero3) faca

      //definindo a soma dos números
      soma <- (numero1+numero2+numero3)
      //definindo o produto dos números
      produto <- (numero1*numero2*numero3)
      // definindo a média dos números
      media <- (numero1+numero2+numero3)/3
      // Pular linha
      escreval()
      //Mostrando a soma dos números
      escreval ("A soma dos valores é igual a: ", soma)
      //Mostrando o produto dos números
      escreval ("O produto dos valores é igual a: ", produto)
      //Mostrando a média dos números
      escreval ("A média dos valores é igual a: ", media)
      //Informação dos procedimentos a serem feitos
      escreval ("Escreva 3 valores em ordem crescente, senão o programa encerra ")
      //Solicitação da digitação do 1° valor
      escreval("Escreva valor 1:")
      //Leitura o valor informado
      leia(numero1)
      //Solicitação da digitação do 2° valor
      escreval("Escreva valor 2:")
      //Leitura o valor informado
      leia(numero2)
      //Solicitação da digitação do 3° valor
      escreval("Escreval Valor 3:")
      //Leitura o valor informado
      leia(numero3)
      //Pular linha
      escreval()
      // Fim da repetição
   fimenquanto
   //Pular linha
   escreval()
   //Informação do que aconteceu
   escreval("O programa encerrou,pois era preciso informar os números em ordem crescentes!")

Fimalgoritmo