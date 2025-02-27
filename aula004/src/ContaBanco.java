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

    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (Objects.equals(t, "CC")) {
            setSaldo(50f);

        } else if(Objects.equals(t, "CP")) {
            setSaldo(150f);

        }
        System.out.println(getSaldo());
    }

    public void fecharConta() {
        if (saldo > 0f) {
            System.out.println("conta com dinheiro");
        } else if(saldo < 0) {
            System.out.println("conta em debito");
        } else {
            setStatus(false);
        }
    }

    public void depositar(float v) {
       if (getStatus()) { //se for verdadeiro
           setSaldo(getSaldo() + v);
       } else {
           System.out.println("impossivel depositar");
       }
    }
    public void sacar(float v) {
        if(getStatus()) { // se a conta estiver aberta
            if (getSaldo() > v) { // e se o saldo da conta for maior que o valor
                setSaldo(getSaldo() - v); // pegue o saldo da conta e subtraia pelo valor
            } else { //senao (ou seja, se o valor for maior que o saldo da conta)
                System.out.println("saldo insuficiente");
            }
        } else { // se nao, ou seja, se a conta estiver fechada
            System.out.println("impossivel sacar");
        }
    }
//    public void pagarMensal() {
//       float v;
//       if (this.tipo.equals("CC")) { //se a conta for corrente
//           v = 12f;
//       } else if (this.tipo.equals("CP")){ //se a conta for poupanca
//           v = 20f;
//       }
//       if(status) { //se a conta estiver aberta
//           if(saldo > v) { //e se o saldo for maior que o valor a ser pago
//               setSaldo(getSaldo() - v);
//           } else { //se nao for, o saldo eh insuficiente
//               System.out.println("Saldo Insuficiente");
//           }
//       } else { // se a conta estiver fechada
//           System.out.println("Impossivel Pagar");
//       }
//    }
}
