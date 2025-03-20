import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Luiz Inacio";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("*******************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);
        System.out.println("\n*******************");

        System.out.println("Operações");



        Scanner sc = new Scanner(System.in);
        int clientOption = 0;
        while (clientOption != 4) {
            System.out.println("1- Consultar Saldos");
            System.out.println("2- Receber Valor");
            System.out.println("3- Transferir Valor");
            System.out.println("4- Sair");
            System.out.println("Digite a opção desejada: ");
            clientOption = sc.nextInt();
            if (clientOption == 1) {
                System.out.printf("Seu saldo atual é: %f%n", saldo);
            } else if (clientOption == 2) {
                System.out.println("Qual a quantidade de valor deseja receber? ");
                double receiveValue = sc.nextDouble();
                saldo += receiveValue;
                System.out.printf("%f recebidos, novo saldo: %f%n", receiveValue, saldo);
            } else if (clientOption == 3) {
                System.out.println("Qual a quantidade de valor que deseja transferir? ");
                double transactionValue = sc.nextDouble();
                if (transactionValue > saldo) {
                    System.out.println("ERRO! Não é possível realizar uma transação maior que o valor do saldo.");
                } else if (transactionValue <= 0) {
                    System.out.println("ERRO! Não é possível realizar uma transação de valor negativo!");
                } else {
                    saldo -= transactionValue;
                    System.out.printf("Transação aceita! Enviando %f\nSaldo atual: %f%n", transactionValue, saldo);
                }
            } else {
                System.out.println("Opcao invalida.");
            }
        }
    }
}