import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Esse numero eh par ");
        } else {
            System.out.println("Esse numero eh impar");
        }
    }
}
