// Visibilidade
/*
    UML
    Diagrama de classes - transforma todo objeto em um retangulo, para ficar mais simples.
    Isso torna mais simples justamente por que existem algumas coisas abstratas que nao dao para ser desenhadas, por exemplo uma aula ou um pedido.

    Modificadores de visibilidade - Indicam o nivel de acesso aos componentes internos de uma classe.
    Podem ser usados os simbolos =>
        +   Publico (Orelhao = todo mundo pode usar)
        -   Privado (Celular = so eu posso usar)
        #   Protegido (Telefone Fixo = so minha mae e os filhos dela podem usar)

        Publico => A classe atual e todas as outras classes.
        Privado => somente a classe atual.
        Protegido => a classe atual e todas as suas sub-classes.


*/

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal"; //Publico
        c1.cor = "Azul"; //Publico
        // c1.ponta = 0.5f; Privado
        c1.carga = 80; //Protegido, consigo usar por que esta dentro de uma classe que utiliza a classe caneta
        // c1.tampada = true; nao consigo mexer desse jeito por que esta privado
        c1.tampar(); //justamente por estar privado, apenas a propria classe consegue mexer, e la na classe caneta, esta sendo mexido atraves desse metodo que esta publico
        c1.status();
    }
}

