# Fila Dinâmica em Java

## Introdução
Este projeto implementa uma fila dinâmica em Java, utilizando conceitos de orientação a objetos. A fila dinâmica é uma estrutura de dados que permite a inserção e remoção de elementos de forma eficiente. A fila segue a política FIFO (First In, First Out), onde o primeiro elemento adicionado é o primeiro a ser removido.

## Estrutura do Projeto
### Classes
- **FilaDinamica**: Classe principal que gerencia a fila.
- **No**: Classe interna que representa um nó da fila, contendo o valor e a referência para o próximo nó.

### Métodos
#### Métodos da Classe FilaDinamica
- `adicionar(int valor)`: Adiciona um elemento ao final da fila.
- `remover()`: Remove o elemento do início da fila.
- `removerTodasOcorrencias(int valor)`: Remove todas as ocorrências de um valor específico na fila.
- `buscar(int valor)`: Busca um valor específico na fila e retorna o valor se encontrado.
- `buscarMaior()`: Encontra e retorna o maior valor presente na fila.
- `buscarMenor()`: Encontra e retorna o menor valor presente na fila.
- `calcularMedia()`: Calcula e imprime a média de todos os elementos da fila.
- `exibir()`: Exibe todos os elementos da fila.
- `quantidade()`: Exibe a quantidade de elementos na fila.

## Conclusão
A implementação da FilaDinamica em Java demonstra a utilização de conceitos de orientação a objetos para criar uma estrutura de dados eficiente e funcional. Através dos métodos disponíveis, é possível adicionar, remover, buscar, calcular a média, e determinar o maior e menor valor entre os elementos da fila.
