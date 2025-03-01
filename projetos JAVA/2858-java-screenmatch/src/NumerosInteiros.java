
import java.util.Scanner;
public class NumerosInteiros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Digite  Dois Numeros inteiros" );
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

if ( numero1 > numero2 ) {
    System.out.print("Numero "+numero1+" e maior que Numero "+numero2);

}if ( numero2 > numero1 ) {

    System.out.print("Numero "+numero2+" e maior que Numero "+numero1);
        }else {
    System.out.print( "O Numero"+ numero1+" e  Identico ao Numero "+numero2);

        }
    }

}
