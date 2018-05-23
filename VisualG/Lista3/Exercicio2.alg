Algoritmo "Lista3_EXERCICIO2"
//
//
// Descrição   : Faça um programa algoritmo para exibir a tabuada de 0 a 9.
// Autor(a)    : Jesiel Carlos da Silva
// Professor   : Aldo Henrique
// Data atual  : 26/03/2018
Var
   // Declarações das variáveis
   valor1,i,i1,tabuada,valor2:inteiro

Inicio

   // Repetição do 0 ao 9
   para i de 0 ate 9 passo 1 faca
      //Exibir a tabuada do número i
      escreval("Tabuada do:",i)
      // Repetição do número a ser múltiplicado de 0 a 10
      para i1 de 0 ate 10 passo 1 faca
         // Formúla da tabuada
         tabuada<- i1*i
         //Exibir tabuada completa
         escreval(i," X",i1,"=",tabuada)
         //Fim da estrutura de repetição
      fimpara
      //Fim da estrutura de repetição que está contida na outra
   fimpara
Fimalgoritmo