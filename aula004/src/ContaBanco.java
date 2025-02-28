import java.util.Objects;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

   public ContaBanco(int n, String t, String d, boolean st) { //metodo construtor
        this.saldo = 0f;
        this.status = false;
        this.numConta = n;
        this.tipo = t;
        this.dono = d;
    }

    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Esta aberta?" + (this.getStatus() ? " essa conta esta aberta" : " essa conta nao esta aberta"));
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }
    public int getNumConta() {
        return this.numConta;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setDono(String d) {
        this.dono = d;
    }
    public String getDono() {
        return this.dono;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public void setStatus(boolean st) {
        this.status = st;
    }
    public boolean getStatus() {
        return this.status;
    }

    public void abrirConta(String t, String d) {
        this.setTipo(t);
        this.setDono(d);
        this.setStatus(true);

        if (Objects.equals(t, "CC")) {
            this.setSaldo(50f);
            System.out.println("Ola, " + d + " Vc abriu uma conta de tipo (CC) conta corrente entao vc inicia com o saldo " + getSaldo());
        } else if(Objects.equals(t, "CP")) {
            this.setSaldo(150f);
            System.out.println("Ola, " + d + " Vc abriu uma conta de tipo (CP) conta poupanca entao vc inicia com o saldo " + getSaldo());
        } else {
            System.out.println("ERRO! Nao foi possivel criar sua conta, escolha: CC para conta corrente ou CP para conta poupanca");
        }

    }

    public void fecharConta() {
        if (saldo > 0f) {
            System.out.println("conta com dinheiro, nao pode ser fechada");
        } else if(saldo < 0) {
            System.out.println("conta em debito, nao pode ser fechada");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(float v) {
       if (this.getStatus()) { //se for verdadeiro
           this.setSaldo(this.getSaldo() + v);
           System.out.println("Vc depositou: " + v + " por isso, agora seu saldo eh " + getSaldo());
       } else {
           System.out.println("impossivel depositar");
       }

    }
    public void sacar(float v) {
        if(this.getStatus()) { // se a conta estiver aberta
            if (this.getSaldo() >= v) { // e se o saldo da conta for maior ou igual ao o valor
                this.setSaldo(this.getSaldo() - v); // pegue o saldo da conta e subtraia pelo valor
                System.out.println("Saque realizado na conta de " + this.getDono() + " por isso, agora seu saldo eh de " + this.getSaldo());
            } else { //senao (ou seja, se o valor for maior que o saldo da conta)
                System.out.println("saldo insuficiente, impossivel sacar");
            }
        } else { // se nao, ou seja, se a conta estiver fechada
            System.out.println("impossivel sacar, essa conta nao esta ativa");
        }
    }
    public void pagarMensal() {
       float v = 0f;
       if (this.tipo.equals("CC")) { //se a conta for corrente
           v = 12f;
       } else if (this.tipo.equals("CP")){ //se a conta for poupanca
           v = 20f;
       }
       if(this.getStatus()) { //se a conta estiver aberta
           if(this.getSaldo() > v) { //e se o saldo for maior que o valor a ser pago
               this.setSaldo(this.getSaldo() - v);
               System.out.println("Vc pagou a mensalidade, por isso agora seu saldo eh" + getSaldo());
           } else { //se nao for, o saldo eh insuficiente
               System.out.println("Saldo Insuficiente");
           }
       } else { // se a conta estiver fechada
           System.out.println("Impossivel Pagar, esta conta esta fechada");
       }

    }
}
