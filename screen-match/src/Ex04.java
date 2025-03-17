import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println("A tabuada do numero escolhido eh: ");
        for (int i = 0; i <= 10; i++) {
            int tabuada = numero * i;
            System.out.println(String.format("%d x %d = %d", numero, i, tabuada));
        }
    }
}
