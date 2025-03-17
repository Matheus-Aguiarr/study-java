import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println(String.format("O fatorial de %d eh %d", numero, fatorial));

    }
}
