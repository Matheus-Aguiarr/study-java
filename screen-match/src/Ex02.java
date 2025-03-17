import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero01 = sc.nextInt();
        System.out.println("Digite mais um numero: ");
        int numero02 = sc.nextInt();
        if (numero01 == numero02) {
            System.out.println("Os numeros sao iguais");
        } else if(numero01 != numero02) {
            System.out.println("Os numeros sao diferentes");
            if (numero01 > numero02) {
                System.out.println("O primeiro numero eh maior que o segundo numero");
            } else {
                System.out.println("O primeiro numero eh menor que o segundo numero");
            }
        }
    }
}
