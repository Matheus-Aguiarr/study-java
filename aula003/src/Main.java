/*
    Métodos Especiais ---
        Métodos Acessores => Getters
        Métodos Modificadores => Setters
        Métodos Construtores => Construct
    ---

MÉTODOS ACESSORES => {

    Vamos supor que temos uma nova estante, e nessa estante, possuem documentos.

        Estante e = new Estante()

    Então, chega um homem e vai consultar quantos documentos ele tem através de um atributo.

        h = e.totDoc;

    Ele descobre que tem 5 documentos. Então chega uma garota, também afim de consultar quantos documentos dela ela tem na estante, e então ela também faz a mesma coisa.

        m = e.totDoc;

    Porém, dessa maneira, fica muito inseguro a estante e os documentos dessa estante, já que qualquer um pode chegar e consultar quantos documentos tem. Então, é ai que entram os métodos acessores.

    Os métodos acessores, seriam como colocar um atendente em frente a estante, que vai perguntar e consultar para as pessoas que chegarem quantos documentos elas tem.

    Então o homem chega e decide consultar quantos documentos ele tem:

        h = getTotDoc();

    Perceba que agora, ele não verifica mais a partir de um atributo, ou seja, ele não tem acesso direto a estante, mas sim, pergunta a um método(atendente), que o responde quantos documentos ele tem.
}

MÉTODOS MODIFICADORES => {
    Vamos supopr que agora, o mesmo homem queira adicionar um documento dele a mais na estante, e então ele simplesmente vai através do atributo:

        e.totDoc = e.totDoc + 1;

    Porém, se todo mundo que chegar e quiser colocar um novo documento na estante dessa maneira, da forma com que cada um quiser colocar, a estante irá ficar bagunçada. E é pra isso que servem os métodos modificadores.
    Agora, funciona basicamente igual ao outro, colocaremos um atendente, que será o nosso Método Setter, que terá acesso a estante e ai sim, ao entregar o documento ao setter, ele colocará na estante.

        e.setTotDoc(doc);
}

Métodos construtores => {
    O método construtor serve para fazer algo automaticamente, sem a interferencia de ninguem para isso.
    Ele é usado sempre que uma classe for transformada em objeto automaticamente. É como se tivesse colocando um padrão.
}
*/

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Rosa", 0.3f);
        c1.status();
    }
}