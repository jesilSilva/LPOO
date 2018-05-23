Algoritmo "Lista3_EXERCICIO10"
//
//
// Descrição   : Faça um programa que leia um número n e mostre na tela os n primeiros números primos.
// Autor (a)   : Jesiel Carlos da Silva
// Professor   : Aldo Henrique
// Data atual  : 01/04/2018
Var
   //Declarações das variáveis
   n, primos,p, cont: inteiro
Inicio
   // Informa um número para verificar os primos existente até ele
   escreval ("Informe o número limite da contagem dos primos")
   //Armazenando o número na variável n
   leia (N)
   //condição de opção inválida
   se (N <= 0 ) entao
      //Exibir opção inválida
      escreva ("Número Inválido")
      //negação da condição acima
   senao
      //repetir até chegar o valor de n
      Para primos de 1 ate N passo 1 faca
         // atribuindo 0 a variável cont
         cont<- 0
         // repetir até primos
         para p de 1 ate primos passo 1 faca
            // condição saber se é primo
            se (Primos mod p = 0) entao
               //atribuindo valor a variável cont
               cont<- cont+1
               //fim da condição
            fimse
            //fim da repetição
         fimpara
         //condição variável cont = 2
         se (cont = 2) entao
            //exibir os primos
            escreval ("Os números primos è:",Primos)
            //fim da condição
         fimse
         //fim da repetição
      fimpara
      //fim da condição
   fimse
Fimalgoritmo