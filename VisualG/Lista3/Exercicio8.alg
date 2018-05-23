Algoritmo "Lista3_EXERCICIO8"
//
//
// Descrição   : Faça um programa que leia um número n e mostre na tela os n
// primeiros números pares e depois os n primeiros números ímpares.
// Autor (a)   : Jesiel Carlos da Silva
// Professor   : Aldo Henrique
// Data atual  : 01/04/2018
Var
   // Declarações das variáveis

   N,i,Par,impar: inteiro
Inicio

   // Solicitando a digitação de um número
   escreva ("Digite um número:  " )
   //Armazenando o número digitado
   leia (N)
   //Pulando uma linha
   escreval()
   // Informando os números pares
   escreval ("Os números Pares: ")
   // repetindo até achar todos números pares dentre o número informado
   para i de 1 ate N passo 1 faca
      // Condição para saber se o número é par
      se (i mod 2 = 0) entao
         //obtendo o número par
         Par <- i
         //exibindo o número par
         escreva (Par)
         //fim da condição
      fimse
      //fim da repetição
   fimpara
   // pulando uma linha
   escreval ()
   //informando os números impares
   escreval ("Os números Impares:")
   //repetindo até achar todos números impares dentre o números digitados
   para i de 1 ate n passo 1 faca
      //condição para saber se o número é impar
      se (i mod 2=1) entao
         //obtendo o número impar
         Impar <- i
         //exibindo o número impar
         escreva (impar)
         //fim da condição
      fimse
      //fim da repetição
   fimpara

Fimalgoritmo