// RELACIONAMENTO ENTRE CLASSES
/*
    UltraEmojiCombate
    Como relacionar classes - Existem varios tipos de relacionamento, mas iremos ver o relacionamento de agregacao
    Podemos criar a classe luta, para fazer com que dois lutadores lutem entre si, e ai criamos dois atributos: desafiador e desafiante, onde cada um dos atributos sera um lutador.
    Tambem temos um atributo de rounds e um atributo que diz se a luta esta aprovada ou nao.

    Teremos dois metodos, marcarLuta() e lutar()

    Para criar um numero aleatorio podemos utilizar a classe random, que eh importada automaticamente pelo java:
        Random aleatorio = new Random();
        int numeroAleatorio = aleatorio.nextInt(3); - Vai criar um numero aleatorio entre 0 1 ou 2
*/

public class Main {
    public static void main(String[] args) {
        Lutador[] L = new Lutador[5];
        L[0] = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 3, 1 );
        L[1] = new Lutador("JavaLi Trator", "Brasil", 82, 1.80f, 68.2f, 29, 2, 1);
        L[2] = new Lutador("PHPeso", "India", 45, 2.50f, 114.8f, 30, 0, 0);
        L[3] = new Lutador("Cobalte", "Escoces", 19, 1.60f, 90.3f, 10, 2, 3);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(L[0], L[1]);
        UEC01.lutar();
    }
}