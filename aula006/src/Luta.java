import java.util.Objects;
import java.util.Random;

public class Luta {
//    Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

//    Metodos publicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(Objects.equals(l1.getCategoria(), l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (isAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("============ RESULTADO =============");
            switch(vencedor) {
                case 0: // Empate
                    System.out.println("A LUTA Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    System.out.println("AGORA OS LUTADORES TEM AMBOS UM EMPATE A MAIS");
                    break;
                case 1: // Desafiado Vence
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println("AGORA O LUTADOR " + this.desafiado.getNome() + " TEM UMA VITORIA A MAIS, TOTALIZANDO:  " + this.desafiado.getVitorias());
                    break;
                case 2: // Desafiante Vence
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    System.out.println("AGORA O LUTADOR " + this.desafiante.getNome() + " TEM UMA VITORIA A MAIS, TOTALIZANDO: " + this.desafiante.getVitorias());
                    break;
            }
        } else {
            System.out.println("A luta nao pode acontecer");
        }
    }
//    GETTERS E SETTERS
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
