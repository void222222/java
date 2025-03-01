 import java.util.Random;
import java.util.Scanner;


public class Adivinha {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
Random rand = new Random();
int numeroSorteado = rand.nextInt(101);

    System.out.println( "Digite o Seu Nome");
String nome = scanner.nextLine();

int tentativas = 0;
int numeroDigitado = -1;

while (tentativas < 5 && numeroDigitado != numeroSorteado) {
    System.out.println("Tente adivinhar o número entre 0 e 100, "+ nome );
    numeroDigitado = scanner.nextInt();
tentativas++;

if (numeroDigitado == numeroSorteado) {

    System.out.println("Parabens Voce Sim Voce mesmo Acertou o numero em " +tentativas + "  tentativas");
} else if (numeroDigitado < numeroSorteado) {

System.out.println("o numero e maior Que isso  ");;

} else    {
    System.out.println("o numero e menor Que isso  ");;

}

if (tentativas == 5 && numeroDigitado != numeroSorteado) {
System.out.print("INfelismente  ja gastou todas as suas tentativas");


}



}

}































}
