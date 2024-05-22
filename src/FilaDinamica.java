public class FilaDinamica {

    private No inicio;
    private No fim;
    private Integer tamanho;

    public FilaDinamica() {
        this.tamanho = 0;
    }

    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.getValor() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }

    public void adicionar(int valor) {
        No novoNo = new No(valor);
        if ( inicio == null ) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            fim = novoNo;
        }
        tamanho++;
    }

    public void remover() {
        if (inicio == fim) {
            inicio = null;
            fim = null;
            System.out.println("A Lista está vazia");
        } else {
            inicio = inicio.getProximo();

        }
        tamanho--;
    }

    public void removerTodasOcorrencias(int valor) {
        while (inicio != null && inicio.getValor() == valor) {
            remover();
        }

        No atual = inicio;
        No anterior = null;

        while (atual != null) {
            if (atual.getValor() == valor) {
                if (anterior != null) {
                    anterior.setProximo(atual.getProximo());
                }
                if (atual == fim) {
                    fim = anterior;
                }
                tamanho--;
            } else {
                anterior = atual;
            }
            atual = atual.getProximo();
        }
    }

    public int buscar(int valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.getValor() == valor) {
                System.out.println("O valor " + valor + " foi encontrado!");
                return valor;
            }
            atual = atual.getProximo();
        }
        System.out.println("O valor " + valor + " não foi encontrado!");
        return valor;
    }

    public void quantidade() {
        System.out.println("O tamanho da Fila é " + tamanho + " posições");
    }
}
