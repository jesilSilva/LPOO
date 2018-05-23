Algoritmo "Lista2_Exercicio5"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Jesiel Carlos da Silva
// Data atual  : 19/03/2018
Var
   // Seção de Declarações das variáveis
   num1,num2,num3,opcao,operacao:real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval("Informe 3 números")
   escreval("Informe o 1° número:")
   leia(num1)
   escreval("Informe o 2° número:")
   leia(num2)
   escreval("Informe o 3° número:")
   leia(num3)
   escreval("Escolha entre as opções:")
   escreval("Calcular média - Digite 1")
   escreval("Calcular soma - Digite 2")
   escreval("Calcular a multiplicação dos números - Digite 3")
   escreva("Digite a opção escolhida:")
   leia(opcao)

   se(opcao=1)entao
      operacao<- (num1+num2+num3)/3
      escreval("A média dos números informados é:",operacao:4:2)

   senao
      se(opcao=2)entao
         operacao<- (num1+num2+num3)
         escreval("A soma dos números informados é:",operacao)
      senao
         se(opcao=3)entao

            operacao<- (num1*num2*num3)
            escreval("A multiplicação dos números informados é:",operacao)
         fimse
      fimse
   fimse
Fimalgoritmo