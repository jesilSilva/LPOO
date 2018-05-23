Algoritmo "Lista1_Exercicio4"
//  
//  
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : Aldo Henrique
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/03/2018
Var
   // Seção de Declarações das variáveis
   a,b,c:real


Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Informe um valor para a variável A:")
   leia(a)
   escreval("Informe um valor para a variável B:")
   leia(b)
   escreval("observe a troca de valores das variaveis:")

   c <- b
   b <- a
   a <- c
   
   escreval("o valor de B:",b)

   escreval("o valor de A:",a)



Fimalgoritmo