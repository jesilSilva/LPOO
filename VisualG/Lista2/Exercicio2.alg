Algoritmo "Lista2_Exercicio2"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : Aldo Henrique
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Jesiel Carlos da Silva
// Data atual  : 07/03/2018
Var
   // Seção de Declarações das variáveis
   L1,L2,L3:inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Informe os lados do triângulo.")

   escreval("Informe o primeiro lado do triângulo:")
   leia(l1)
   escreval("Informe o segundo lado do triângulo:")
   leia(l2)
   escreval("Informe o terceiro lado do triângulo:")
   leia(l3)

   se((L1+L2 > L3) e (L2+L3 > L1) e (L3+L1 > L2))  entao
      escreval("os lados informados forma um triângulo")
      se (((L1=L2) e (l1<>L3)) ou ((L2=L3) e (l2<>L1)) ou ((L3=L1) e (l3<>l2))) entao
         escreval("Esse Triângulo é isosceles")
      senao
         se((l1<>l2) e (l2<>l3) e (l3<>l1))    entao
            escreval("Esse Triângulo é escaleno")
         senao
            se((l1=l2) e (l2=l3) e (l1=l3))    entao
               escreval("Esse Triângulo é equilatero")
            fimse
         fimse
      fimse
   senao
      escreval("Os lados informados não formam um triângulo e não temos como continuar")
   fimse


Fimalgoritmo