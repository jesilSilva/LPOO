Algoritmo "Lista2_Exercicio4"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Jesiel Carlos da Silva
// Data atual  : 07/03/2018
Var
   // Seção de Declarações das variáveis
   valor1,valor2,valor3,ordem:real
   op: caracter

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   escreval("Informe o 1° valor:")
   leia(valor1)
   escreval("Informe o 2° valor:")
   leia(valor2)
   escreval("Informe o 3° valor:")
   leia(valor3)

   escreval("Escolha a ordem para apresentar os valores:")
   escreval("C para Crescente e D para Decrescente")
   leia(op)

   se(op="c")entao
      se ((valor1< valor2) e (valor2<valor3) e (valor1<valor3)) entao

         escreval("A ordem crescente é:",valor1,valor2,valor3)
      senao
         se ((valor1< valor3) e (valor3<valor2) e (valor1<valor2)) entao

            escreval("A ordem crescente é:",valor1,valor3,valor2)
         senao

            se((valor2<valor1) e (valor1<valor3) e (valor2<valor3))   entao
               escreval("A ordem crescente é:", valor2, valor1,valor3)
            senao
               se((valor2<valor3) e (valor3<valor1) e (valor2<valor1))   entao
                  escreval("A ordem crescente é:", valor2, valor3,valor1)
               senao
                  se((valor3<valor1) e (valor1<valor2) e (valor3<valor2))   entao
                     escreval("A ordem crescente é:", valor3, valor1,valor2)
                  senao
                     se((valor3<valor2) e (valor2<valor1) e (valor3<valor1))   entao
                        escreval("A ordem crescente é:", valor3, valor2,valor1)

                     fimse
                  fimse
               fimse
            fimse
         fimse
      fimse
      fimse

      se(op="d")entao
         se ((valor1> valor2) e (valor2>valor3) e (valor1>valor3)) entao

            escreval("A ordem crescente é:",valor1,valor2,valor3)
         senao
            se ((valor1> valor3) e (valor3>valor2) e (valor1>valor2)) entao

               escreval("A ordem crescente é:",valor1,valor3,valor2)
            senao

               se((valor2>valor1) e (valor1>valor3) e (valor2>valor3))   entao
                  escreval("A ordem crescente é:", valor2, valor1,valor3)
               senao
                  se((valor2>valor3) e (valor3>valor1) e (valor2>valor1))   entao
                     escreval("A ordem crescente é:", valor2, valor3,valor1)
                  senao
                     se((valor3>valor1) e (valor1>valor2) e (valor3>valor2))   entao
                        escreval("A ordem crescente é:", valor3, valor1,valor2)
                     senao
                        se((valor3>valor2) e (valor2>valor1) e (valor3>valor1))   entao
                           escreval("A ordem crescente é:", valor3, valor2,valor1)

                        fimse
                     fimse
                  fimse
               fimse
            fimse
         fimse
         fimse




Fimalgoritmo