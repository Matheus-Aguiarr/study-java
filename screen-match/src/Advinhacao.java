import java.util.Random;
import java.util.Scanner;

public class Advinhacao {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);

        System.out.println("BEM VINDO AO JOGO DA ADIVINHACAO!! UM NUMERO ALEATORIO FOI GERADO, E VOCE TEM 5 TENTATIVAS PARA TENTAR DESCOBRI-LO! BOA SORTE");
        Scanner sc = new Scanner(System.in);

        int tentativa = 101;
        int totalDeTentativas = 1;



        while(tentativa != numeroAleatorio && totalDeTentativas < 5) {
                System.out.println("Digite sua tentativa: ");
                tentativa = sc.nextInt();
                totalDeTentativas++;

            if (tentativa == numeroAleatorio) {
                System.out.println("Acertou!");
                break;
            } else if(tentativa > numeroAleatorio) {
                    System.out.println("Errado! Tente um numero menor");
            } else {
                    System.out.println("Errado! Tente um numero maior");
            }

            if(totalDeTentativas == 5 && tentativa != numeroAleatorio) {
                System.out.println("vc nao conseguiu, o numero aleatorio gerado era: " + numeroAleatorio);
            }



        }
        System.out.println("Total de tentativas: " + totalDeTentativas);
    }
}
