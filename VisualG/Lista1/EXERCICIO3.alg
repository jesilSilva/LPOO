Algoritmo "Lista1_Exercicio3"
// Disciplina  :  [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/03/2018
Var
   // Seção de Declarações das variáveis
   raio,altura, volume:real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Informe o raio da lata de oléo:")
   leia(raio)
   escreva("Informe a altura da lata de oléo:")
   leia(altura)

                      volume <- ( pi*(raio^2))*altura
                      
   escreval("O volume da lata de oléo é:",volume:5:2)

Fimalgoritmo