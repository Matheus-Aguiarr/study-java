import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Esse numero eh negativo");
        } else {
            System.out.println("Esse numero eh positivo");
        }
    }
}
