Algoritmo "Lista3_EXERCICIO9"
//
//
// Descrição   : Faça um programa que leia um número n e imprima se ele é primo ou não.
// Autor (a)   : Jesiel Carlos da Silva
// Professor   : Aldo Henrique
// Data atual  : 01/04/2018
Var
   //Declarações das variáveis

   N,cont,Primo, divisor: inteiro
Inicio
   //Solicitando um número
   escreval ("Informe um número que deseja identificar se é Primo ou não.")
   //armazenando um número
   leia (N)
   //condição n menor que 0
   se (N <=0 ) entao
      // informação de número inválido
      escreva ("Número inválido")
      //negação da condição acima
   senao
      //repetição de números
      Para primo de 1 ate N passo 1 faca
         // atribuindo 0 a variavel cont
         cont<-0
         //repetição de números
         para divisor de 1 ate primo faca
            //condição primo
            se (Primo mod divisor= 0) entao
               //atribuindo valor a variável cont
               cont<- cont+1
               // fim da condição
            fimse
            // fim da repetição
         fimpara
         //fim da repetição
      fimpara
      // fim da condição
   fimse
   // condição de números primos
   se (cont = 2) entao
      //Informação a ser exibida do número primo
      escreval ("O número ", N, " é um número Primo")
      //negação da condição acima
   senao
      //Informação a ser exibida do número não primo
      escreval ("O número ", N," não é um número Primo")
      //fim da condição
   fimse


Fimalgoritmo