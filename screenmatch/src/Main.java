import br.com.alura.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefinho";
        meuFilme.anoDeLancamento = 2018;
        meuFilme.duracaoEmMinutos = 190;
        meuFilme.inclusoNoPlano = true;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliacoes: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Media de avaliacoes: " + meuFilme.mediaDasAvaliacoes());

    }
}