
import java.util.Scanner;
public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( "Digite um Numero de 1 a 10");
        int numero = scanner.nextInt();

for ( int i = 1; i <= 10; i++ ) {

    System.out.println(numero + " x " + i + " = " + (numero * i));


}


    }
}
