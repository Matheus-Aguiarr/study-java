public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;



    void status() {
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Esta tampada? " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Nao eh possivel rabiscar com a caneta " + this.cor + " pois esta tampada");
        } else {
            System.out.println("Estou rabiscando com a caneta " + this.cor);
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
