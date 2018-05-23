Algoritmo "Lista3_EXERCICIO7"
//
//
// Descrição   : Faça um programa que leia as médias finais de vários alunos de uma turma e mostre a maior média,
// a menor média e a média aritmética da turma.
// O programa para quando encontrar uma média negativa.
// Autor (a)   : Jesiel Carlos da Silva
// Professor   : Aldo Henrique
// Data atual  : 01/04/2018
Var
   // Declaração de variáveis
   cont:inteiro

   guardaMedia,media, maior, menor,total: real

Inicio

   escreval ("Informe a média do aluno:")
   //Armazenamento da terceira nota
   leia(media)

   maior<-media
   menor<-menor
   cont<-1
   enquanto media >= 0 faca

      cont<- cont+1
      // Somando as médias obtidas
      guardaMedia <- (guardaMedia+Media)
      //Informando a media do aluno
      escreval ("Informe a média do aluno:")
      //Armazenamento da terceira nota
      leia(media)




      //Condição de media > maior
      Se (media > maior ) entao
         // Armazenar a média maior
         Maior <- media
         //negação da condição
      senao
         // Armazena a média menor
         menor <- media
      fimse
      // fim da repetição

   fimenquanto
   //Condição necessária porque o Visual não conseguia
   // fazer o jogo de sinal correto.
   //Ex: - com - = +
   //   + com - = -
   se(media<0)entao
      guardaMedia<-(guardaMedia+media)
      escreva(guardaMedia)
   fimse


   total<- guardaMedia/cont
   //Exibição da média total
   escreval(cont)
   escreval(guardaMedia)
   escreval ("A média de todos os alunos é igual a ", total:4:2 )
   //Exibição da maior nota juntamente com o nome do individuo
   escreval ("A maior média foi ", Maior:4:2)
   //Exibição da menor nota juntamente com o nome do individuo
   escreval ("A menor média foi ", Menor:4:2)

Fimalgoritmo