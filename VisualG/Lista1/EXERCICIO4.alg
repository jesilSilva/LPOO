Algoritmo "Lista1_Exercicio4"
//  
//  
// Disciplina  :  [Linguagem e L�gica de Programa��o]
// Professor   : Aldo Henrique
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/03/2018
Var
   // Se��o de Declara��es das vari�veis
   a,b,c:real


Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreval("Informe um valor para a vari�vel A:")
   leia(a)
   escreval("Informe um valor para a vari�vel B:")
   leia(b)
   escreval("observe a troca de valores das variaveis:")

   c <- b
   b <- a
   a <- c
   
   escreval("o valor de B:",b)

   escreval("o valor de A:",a)



Fimalgoritmo