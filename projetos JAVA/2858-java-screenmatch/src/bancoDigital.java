import java.util.Scanner;

public class bancoDigital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tela ;
        tela = """
                ************************************************
                Dados do Cliente:
                
                Nome :          Lucas santos 
                tipo da conta : Corente
                saldo da conta : R$2000
                
                ***********************************************  
                """;

        String menu = """
                  Operações :
                1-Consulta 
                2-Reseber Valor
                3-Tranferir Valor
                4-Sair
              
                """;



        int SaldoDaConta = 2000;
        int opcao  = 0;


     while(opcao != 4) {
         System.out.println( menu);
        System.out.println(" Escolha sua opsao desejada: ");
        opcao = scanner.nextInt();

         switch (opcao) {

             case 1:
                 System.out.println("esse eo saldo atual da sua conta:R$ "+SaldoDaConta );
                 break;

             case 2:
                 System.out.print("Qual eo valor a Reseber ?"  );
                 int ValorAreseber= scanner.nextInt();
                SaldoDaConta += ValorAreseber;;

                 System.out.println("O valaor Atual da conta E :R$"+SaldoDaConta);
                 break;
             case 3:
                 System.out.print("Qual eo valor da Transferencia ?"  );
                 int ValorTransferencia = scanner.nextInt();

                 if(SaldoDaConta < ValorTransferencia ){
                     System.out.println("voce nao tem saldo o suficiente");
                 }else {
                     SaldoDaConta = SaldoDaConta - ValorTransferencia;
                     System.out.println("O valaor Atual da conta E :R$ "+ SaldoDaConta);
                 }

                 break;
             case 4:
                 System.out.print("voce Enserou a sesao "  );
                break;
                default:
                    System.out.print("Por favor digite um numero de 1 a 4");
         }

     }

        scanner.close();



    }
}
