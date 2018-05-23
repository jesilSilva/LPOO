Algoritmo "PROJETO"
//
//
// Descrição   : Projeto de LPOO
// Autor(a)    : Jesiel Carlos da Silva
// Data atual  : 21/03/2018
// Professor   : Aldo Henrique
Var
   // Seção de Declarações das variáveis
   Vi : vetor [0..7] de inteiro
   sexo,selecao,b:caracter
   decimal,resposta, contador, primo, divisor, somaPrimo, idade,idade2,idade3,qtd,contador1,contador2, n,i,num1,num2,opcao:inteiro
   mediaGeral,mediaSexoF,mediaSexoM, operacao:real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   repita(opcao<>7)
      //Menu de opções

      escreval("Escolha uma opção do MENU")
      escreval("1. Soma")
      escreval("2. Subtração")
      escreval("3. Divisão")
      escreval("4. Faixa etária")
      escreval("5. Números primos")
      escreval("6. Mudança de Base")
      escreval("7. Sair")
      // leitura da opção
      escreva("Informe a sua escolha:")
      leia(opcao)
       // repetir o menu até que a opção digitada esteja nele
      enquanto opcao >7 faca
         escreval("Por favor escolha uma opção que esteja no menu")
         //Menu de opções

         escreval("Escolha uma opção do MENU")
         escreval("1. Soma")
         escreval("2. Subtração")
         escreval("3. Divisão")
         escreval("4. Faixa etária")
         escreval("5. Números primos")
         escreval("6. Mudança de Base")
         escreval("7. Sair")
         escreva("Informe a sua escolha:")
         leia(opcao)
      fimenquanto
      // Se a opção escolhida for 1 o bloco abaixo será executado
      se(opcao=1) entao
         escreval("Informe dois números para soma")
         //Leitura do 1° número
         escreval("Informe o 1° número:")
         leia(num1)
         //Leitura do 2° número
         escreval("Informe o 2° número:")
         leia(num2)
         //Soma de dois números
         operacao<- num1+num2
         //Exibir o resultado da soma
         escreval("O resultado da soma é:",operacao)
      senao
         // Se a opção escolhida for 2 o bloco abaixo será executado
         se(opcao=2) entao
            escreval("Informe dois números para subtração")
            //Leitura do 1° número
            escreval("Informe o 1° número:")
            leia(num1)
            //Leitura do 2° número
            escreval("Informe o 2° número:")
            leia(num2)
            //Subtração de dois números
            operacao<- num1-num2
            //Exibir o resultado da subtração
            escreval("O resultado da subtração é:",operacao)
         senao
            // Se a opção escolhida for 3 o bloco abaixo será executado
            se(opcao=3) entao
               escreval("Informe dois números para divisão")
               //Leitura do 1° número
               escreval("Informe o 1° número:")
               leia(num1)
               //Leitura do 2° número
               escreval("Informe o 2° número:")
               leia(num2)
               //Divisão de dois números
               operacao<- num1/num2
               //Exibir o resultado da divisão
               escreval("O resultado da divisão é:",operacao)
            senao
               // Se a opção escolhida for 4 o bloco abaixo será executado
               se(opcao=4) entao
                  //Leitura da qtd de pessoas
                  escreval("Informe a quantidade de pessoas")
                  leia(qtd)
                  //Repetição de informações para a qtd de pessoas
                  para i de 1 ate qtd passo 1 faca
                     limpatela
                     //Leitura de idade das pessoas
                     escreval("Informe idade da pessoa",i)
                     leia(n)
                     //Leitura de sexo das pessoas
                     escreval("informe o sexo da pessoa",i)
                     leia(sexo)
                     //Contador da idade de todas as pessoas
                     idade<- idade+ n
                     //Média da idade de todas as pessoas
                     mediaGeral<- idade/qtd
                     //se o sexo informado for M o bloco abaixo será executado
                     se(sexo="m") entao
                        // Contador de pessoas do sexo M
                        contador1<- contador1 + 1
                        // Contador de idade das pessoas do sexo M
                        idade2<- idade2 + n
                        //Média de idade das pessoas do sexo M
                        mediaSexoM<- idade2/contador1
                        //Fechamento do bloco de condição
                     fimse
                     //se o sexo informado for F o bloco abaixo será executado
                     se(sexo="f")entao
                        // Contador de pessoas do sexo F
                        contador2<- contador2 + 1
                        // Contador de idade das pessoas do sexo F
                        idade3<- idade3 + n
                        //Média de idade das pessoas do sexo F
                        mediaSexoF<- idade3/contador2
                        //Fechamento do bloco de condição
                     fimse
                     //Fim da Repetição de informações para a qtd de pessoas
                  fimpara
                  //Exibição da média geral das pessoas
                  escreval("A média de idade das pessoas é:",mediaGeral)
                  //Exibição da média dos homens
                  escreval("A média de idade dos homens é:",mediaSexoM)
                  //Exibição da média das mulheres
                  escreval("A média de idade das mulheres é:",mediaSexoF)
                  //Zerando as variáveis para evitar que possam acumular valores
                  idade<- 0
                  idade2<- 0
                  idade3<- 0
                  contador1<- 0
                  contador2 <- 0
                  mediaGeral<- 0
                  mediaSexoM<- 0
                  mediaSexoF<- 0

               senao
                  // Se a opção escolhida for 5 o bloco abaixo será executado
                  se(opcao=5)entao
                     //Leitura do valor N
                     escreval ("Defina o valor de n:")
                     leia (n)
                     //Condição se n for menor ou igual a 0
                     se (n <= 0) entao
                        escreval ("Valor inválido!")
                     senao
                        //Repetição de números primospara a qtd de pessoas
                        para primo de 1 ate n passo 1 faca
                           //Zerando a variável
                           contador <- 0
                           para divisor de 1 ate primo passo 1 faca
                              // se é primo ou não
                              se (primo mod divisor = 0) entao
                                 contador <- contador + 1
                              fimse
                           fimpara
                           se contador = 2 entao
                              //Soma de números primos
                              somaPrimo<- somaPrimo + primo
                              //Exibir números primos
                              escreval ("Os Números Primos são: ", primo, " ")
                           fimse
                        fimpara
                        //Exibir soma de números primos
                        escreval("A soma dos números primos é:",somaPrimo)
                        //Zerando variável para evitar acumular valor
                        somaPrimo<-0

                     fimse
                  senao
                     // Se a opção escolhida for 6 o bloco abaixo será executado
                     se(opcao=6) entao
                        //Leitura da operação que o usuário escolher
                        escreval("Escolha B para converter um número decimal em  Binário ou D para converter um número binário em  Decimal:")
                        leia (selecao)
                        //Se a operação for B o bloco abaixo será executado
                        se (selecao="B") entao
                           //Leitura do número decimal
                           escreval("Digite o número decimal que deseja fazer a conversão para binário :")
                           leia(vi[1])
                           // Guardar número para exibir no resultado
                           vi[2] <- vi[1]
                           //Repetir até y ser menor que 0
                           enquanto vi[1] > 0 faca

                              se (vi[1] mod 2) = 0 entao
                                 //B recebe o caractere "0"
                                 B <- "0"+B
                              senao
                                 // Se o resto for superior a 0 receber o caractere "1"
                                 B <- "1"+B
                              fimse
                              //Divisão de Y por 2. Y irá receber o resultado da divisão.
                              vi[1] <- vi[1] div 2
                              // Fim da a repetição
                           fimenquanto
                           //Exibir resultado
                           escreval("A representação binária de", vi[2], " é ", B)
                        senao
                           //Se a operação for D o bloco abaixo será executado
                           se (selecao="D") entao
                              //Repetir os 8 dígitos do binário
                              para i de 7 ate 0 passo -1 faca
                                 //Representar cada opção em sua ordem
                                 escreval ("Digite os dígitos binários  ",8-i,":")// será representado cada opção em sua ordem
                                 //Atribuir o vetor a i
                                 leia (vi[i])
                                 //Se o valor de Vetor = a 1
                                 se (vi[i]=1) entao
                                    //resposta recebe 1
                                    resposta<-1
                                    // N irá até a posição atual de i (7 a 0)
                                    para n de 1 ate i passo 1 faca
                                       //Resposta multiplicado por 2
                                       resposta<-resposta*2
                                    fimpara
                                    //Decimal recebe Decimal somado com o produto de i*resposta
                                    decimal<-decimal+vi[i]*resposta
                                 fimse
                                 //Fim de repetição
                              fimpara
                              //Exibir o número convertido
                              escreval ("Decimal: ", decimal)

                           fimse
                        fimse
                        //Fim de escolha
                     fimescolha
                     //Os fins se encerra toda expressão de condição aberta acima
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse
   //Encerra quando opção do menu for 7
ate(opcao=7)

Fimalgoritmo