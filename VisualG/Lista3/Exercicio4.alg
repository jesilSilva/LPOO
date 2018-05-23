Algoritmo "Lista3_EXERCICIO4"
//  
//  
//
//
// Descrição   : Escreva um algoritmo que gera números entre 1000
// e 1999 e mostra aqueles que divididos por 11 dão resto 5.
// Autor (a)   : Jesiel Carlos da Silva
// Professor   : Aldo Henrique
// Data atual  : 01/04/2018
Var
   //Declaração da variável

   n:inteiro
Inicio
   /
   //Atribuindo o valor 1000 a variável n
   n <- 1000
   //Repetir aparti de 1000 de 1 em 1 até 1999
   para n de n  ate 1999 passo 1 faca
      //Condição se o resto da divisão é = 5
      se (n mod 11=5) entao
         //  Exibir informação e o número que tem resto 5
         escreval("Os números que divido por 11 tem resto 5:",n)
      //fim da condição
      fimse
   //fim da estrutura de repetição
   fimpara
Fimalgoritmo