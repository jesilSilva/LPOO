Algoritmo "Lista2_Exercicio3"
//
//


Var
   media,nota1, nota2, nota3: real


Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   escreval("Informe a primeira nota:")
   leia(nota1)
   escreval("Informe a segunda nota:")
   leia(nota2)
   escreval("Informe a terceira nota:")
   leia(nota3)

   se((nota1 > nota2) e (nota1 > nota3)) entao
      escreval("A primeira nota informada é a maior:",nota1)
   senao
      se((nota2 > nota1) e (nota2 > nota3)) entao
         escreval("A segunda nota informada é a maior:",nota2)
      senao
         escreval("A terceira nota informa é a maior:", nota3)
      fimse

   fimse


   media <- (nota1 + nota2 + nota3) / 3

   escreval("A média das notas é:", media:4:2)

Fimalgoritmo