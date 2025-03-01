
import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( "Digite o Seu Numero");
     int numero = scanner.nextInt();

        if ( numero  >= 1){
            System.out.println( "seu Numero e Positivo");
    }else if (numero  <= 0){
        System.out.println( "seu Numero e Negativo");
        }
    }


}
