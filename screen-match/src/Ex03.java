import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Calcular a area do quadrado\n2. Calcular a area do circulo");
        System.out.println("DIGITE SUA OPCAO: ");
        int opcaoDigitada = sc.nextInt();

        if (opcaoDigitada == 1) {
            System.out.println("Digite o tamanho do lado do quadrado: ");
            int ladosDoQuadrado = sc.nextInt();
            double calculoDaArea = ladosDoQuadrado * ladosDoQuadrado;
            System.out.println("Area do quadrado com lado: " + ladosDoQuadrado + " eh igual a " + calculoDaArea);
        } else if (opcaoDigitada == 2) {
            System.out.println("Digite o raio do circulo: ");
            double raioDoCirculo = sc.nextDouble();
            double calculoDaAreaDoCirculo = 3.14 * raioDoCirculo * raioDoCirculo;
            System.out.println(String.format("A area do circulo com o raio de: %f; eh igual a: %f", raioDoCirculo, calculoDaAreaDoCirculo));
        } else {
            System.out.println("ERRO! Nao ha essa opcao");
        }

    }
}
