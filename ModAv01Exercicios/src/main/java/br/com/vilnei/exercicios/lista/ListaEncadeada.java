package br.com.vilnei.exercicios.lista;

public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;
    private final int NAO_ENCONTRADO = -1;

    public void adiciona (T elemento) {
        No<T> celula;
        celula = new No<T>(elemento);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public void adicionaInicio (T elemento) {
        if (this.tamanho == 0) {
            No<T> novoNo = new No<>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else {
            No<T> novoNo = new No<>(this.inicio, elemento);
            this.inicio = novoNo;
        }
        this.tamanho ++;
    }

    public void adiciona ( int posicao, T elemento) {

        if (posicao < 0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Posição inválida!");
        }

        if ( posicao == 0) {
            this.adicionaInicio(elemento);
        } else if ( posicao == this.tamanho) {
           this.adiciona(elemento);
        } else {
            No<T> noAnterior = this.buscarNo(posicao);
            No<T> proximoNo = noAnterior.getProximo();
            No<T> novoNo = new No<>(proximoNo, elemento);
            noAnterior.setProximo(novoNo);
            this.tamanho ++;
        }
    }

    public void deletarLista () {
        for (No<T> atual = this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public void removeInicio () {

        if ( this.tamanho == 0 ) {
            throw new  RuntimeException("lista vazia");
        }

        this.inicio = this.inicio.getProximo();
        this.tamanho--;

        if (this.tamanho == 0 ) {
            this.ultimo = null;
        }

    }

    public void removeFinal () {
        if (this.tamanho == 0 ) {
            throw new RuntimeException("Lista Vazia");
        }
        if (this.tamanho == 1 ) {
            this.removeInicio();
        }
        No<T> penultimoNo = this.buscarNo(this.tamanho - 2);
        penultimoNo.setProximo(null);
        this.ultimo = penultimoNo;
        this.tamanho--;
    }

    public void removeMeio (int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            throw new RuntimeException("Posição incorreta!");
        }
        if (posicao == 0 ) {
            this.removeInicio();
        }
        if (posicao == this.tamanho - 1) {
            this.removeFinal();
        }
        No<T> noAnterior = this.buscarNo(posicao - 1);
        No<T> atual = noAnterior.getProximo();
        No<T> proximo = atual.getProximo();
        noAnterior.setProximo(proximo);
        atual.setProximo(null);
        this.tamanho --;
    }

    public No<T> buscarNo (int posicao) {

        if (posicao < 0 || posicao >= this.tamanho) {
            throw new IllegalArgumentException("Posição não existe!");
        }

        No<T> noAtual = this.inicio;

        for ( int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }

        return noAtual;
    }

    public T buscarPorPosicao (int posicao) {
        return this.buscarNo(posicao).getElemento();
    }

    public int buscar (T elemento) {
        No<T> noAtual = this.inicio;
        int pos = 0;

        while (noAtual != null) {
            if (noAtual.getElemento().equals(elemento)) {
                return pos;
            }

            pos++;
            noAtual = noAtual.getProximo();
        }
        return NAO_ENCONTRADO;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        if (this.tamanho == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        No<T> atual = this.inicio;
        for (int i = 0; i < this.tamanho -1; i++) {
            builder.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");
        return builder.toString();
    }

}