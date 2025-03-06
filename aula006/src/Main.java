// RELACIONAMENTO ENTRE CLASSES
/*
    UltraEmojiCombate
*/

public class Main {
    public static void main(String[] args) {
        Lutador[] L = new Lutador[5];
        L[0] = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 3, 1 );
        L[1] = new Lutador("JavaLi Trator", "Brasil", 82, 1.80f, 79.2f, 29, 2, 1);
        L[2] = new Lutador("PHPeso", "India", 45, 2.50f, 114.8f, 30, 0, 0);
        L[3] = new Lutador("Cobalte", "Escoces", 19, 1.60f, 90.3f, 10, 2, 3);
        L[0].Status();
        L[1].Status();
        L[2].Status();
        L[3].Status();

    }
}