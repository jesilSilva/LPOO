Algoritmo "Lista3_EXERCICIO5"
//
//
// Descrição   : Faça um programa que leia vários inteiros positivos e mostre,no final, a soma dos números
// par e se a soma dos números ímpares.O programa para quando entrar um número maior que 1000.
// Autor (a)   : Jesiel Carlos da Silva
// Professor   : Aldo Henrique
// Data atual  : 01/04/2018
Var
   //Declarações das variáveis

   impar,N,par:inteiro
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
    //Início da estrutura de repetição
   repita
   //Exibição da informação que solicita o número
      escreval("Informe números positivos e pressione Enter, caso queira sair digite um número maior que 1000")
     // armazenar o valor digitado na variável N
      leia (N)
      se(n<0)entao
      enquanto n<0 faca
      escreval("O número digitado precisa ser positivo")
      leia(N)
      fimenquanto
      fimse
      // Condição se n for menor que 1000 pegue o número par se nao pegue o número impar
      se (n<=1000)entao
         se (N mod 2=0) entao
            //Obtendo Número par
            par<- par+N

         senao
         //Obtendo o número impar
            impar<- impar+N
          //fim da condição
         fimse
       //fim da condição
      fimse
   // A repetição é feita enquanto n for menor que 1000
   ate (N > 1000)
   // Mostra a soma dos números pares
   escreval ("A soma de pares : ", par)
   // Mostra a soma dos números impares
   escreval ("A soma dos impares : ", impar)

Fimalgoritmo