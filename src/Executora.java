public class Executora {
    public static void main(String[] args) {
        FilaDinamica filaDinamica = new FilaDinamica();
        filaDinamica.adicionar(1);
        filaDinamica.adicionar(2);
        filaDinamica.adicionar(3);
        filaDinamica.adicionar(4);
        filaDinamica.adicionar(5);

        filaDinamica.exibir();
        filaDinamica.remover();
        filaDinamica.removerTodasOcorrencias(2);
        filaDinamica.buscar(5);
        filaDinamica.buscarMaior();
        filaDinamica.buscarMenor();
        filaDinamica.calcularMedia();
        filaDinamica.quantidade();

    }
}