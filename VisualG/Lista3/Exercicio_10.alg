Algoritmo "Lista3_EXERCICIO10"
//
//
// Descri��o   : Fa�a um programa que leia um n�mero n e mostre na tela os n primeiros n�meros primos.
// Autor (a)   : Jesiel Carlos da Silva
// Professor   : Aldo Henrique
// Data atual  : 01/04/2018
Var
   //Declara��es das vari�veis
   n, primos,p, cont: inteiro
Inicio
   // Informa um n�mero para verificar os primos existente at� ele
   escreval ("Informe o n�mero limite da contagem dos primos")
   //Armazenando o n�mero na vari�vel n
   leia (N)
   //condi��o de op��o inv�lida
   se (N <= 0 ) entao
      //Exibir op��o inv�lida
      escreva ("N�mero Inv�lido")
      //nega��o da condi��o acima
   senao
      //repetir at� chegar o valor de n
      Para primos de 1 ate N passo 1 faca
         // atribuindo 0 a vari�vel cont
         cont<- 0
         // repetir at� primos
         para p de 1 ate primos passo 1 faca
            // condi��o saber se � primo
            se (Primos mod p = 0) entao
               //atribuindo valor a vari�vel cont
               cont<- cont+1
               //fim da condi��o
            fimse
            //fim da repeti��o
         fimpara
         //condi��o vari�vel cont = 2
         se (cont = 2) entao
            //exibir os primos
            escreval ("Os n�meros primos �:",Primos)
            //fim da condi��o
         fimse
         //fim da repeti��o
      fimpara
      //fim da condi��o
   fimse
Fimalgoritmo