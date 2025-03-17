import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lancamento? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga a sua avaliacao de 0 a 10 para o filme: ");
        double avaliacao = leitura.nextDouble();


        System.out.println(String.format("Seu filme favorito escolhido foi %s, ele foi lancado em %d e sua avaliacao foi %f", filme, anoDeLancamento, avaliacao));
    }
}
