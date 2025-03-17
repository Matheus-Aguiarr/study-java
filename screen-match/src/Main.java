public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        String name = "Vingadores Ultimato";
        int ano = 2019;
        System.out.println("Ano de lancamento: " + ano);
        boolean incluidoNoPlano = true;
        String isIncluded = incluidoNoPlano ? "It's included" : "It's not included";

        System.out.println(String.format("The name of the movie is %s, it was made in %d and %s on the plan", name, ano, isIncluded));

        double media = (9.0 + 8.0 + 10.0) /3;
        System.out.println("Media: " + media);

        int classificacao = (int) (media /2); // Conversao do valor de double pra int
        System.out.println("Classificacao " + classificacao);
        for(int i = 0; i <= classificacao; i++) {
            System.out.println("#");
        }

        int celsius = 32;
        double farenheit = (celsius * 1.8) + 32;
        System.out.println(String.format("the value %dC in farenheit is %f", celsius, farenheit));


    }
}