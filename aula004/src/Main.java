

public class Main {
    public static void main(String[] args) {
        ContaBanco c = new ContaBanco(1, "CC", "Joao", true);
        c.abrirConta("CP", "Matheus");
        c.pagarMensal();
        c.depositar(600f);
        c.sacar(730f);
        c.estadoAtual();

    }
}