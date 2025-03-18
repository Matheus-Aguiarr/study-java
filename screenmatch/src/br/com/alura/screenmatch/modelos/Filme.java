package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean inclusoNoPlano;
    private double  somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + this.nome);
        System.out.println("Ano de lancamento: " + this.anoDeLancamento);
    }

    public void avalia(double nota) {
        this.somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double mediaDasAvaliacoes() {
        double media = somaDasAvaliacoes / totalDeAvaliacoes;
        return  media;
    }
}
