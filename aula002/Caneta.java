public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;



    public void status() {
        System.out.println("modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Nao eh possivel rabiscar com a caneta " + this.cor + " pois esta tampada");
        } else {
            System.out.println("Estou rabiscando com a caneta " + this.cor);
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
