Algoritmo "Lista3_Exercicio1"
//
//
// Descrição   : Escreva um algoritmo que lê 15 valores reais,
// encontra o maior e o menor deles e mostra o resultado.
// Professor: Aldo Henrique
// Autor(a)    : Jesiel Carlos da Silva
// Data atual  : 25/03/2018
Var
   // Declarações das variáveis
   i:inteiro
   armazena,maior,menor, num:real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   //Escreve uma informação na tela
   escreval("Informe o 1° número:")
   //Lê a informação digitada na tela
   leia(num)
   // Armazena o valor digitado em outras variáveis
   maior<- num
   menor<- num

   //Repeti 15 vezes as ações abaixo
   para i de 2 ate 15 passo 1 faca
      //Condição para saber se o número é maior
      se(num > maior)   entao
         // caso entre na condição a variável maior recebe o valor de num
         maior<- num
         //fim da condição
      fimse
      // condição para saber se o número é menor
      se(num < menor) entao
         // caso entre na condição a variável menor recebe o valor de num
         menor<- num
         //fim da condição
      fimse
      //Exibir informação na tela solicitando o número
      escreval("Informe o ",i,"° número:")
      //Armazenando o número digitado
      leia(num)
     //Fim da estrutura de repetição
   fimpara
   //Exibir o número maior
   escreval("O maior número é:",maior)
   //Exibir o número menor
   escreval("O menor número é:", menor)

Fimalgoritmo