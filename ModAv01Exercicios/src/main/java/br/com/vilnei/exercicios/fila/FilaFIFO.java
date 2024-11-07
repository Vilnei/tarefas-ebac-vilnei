package br.com.vilnei.exercicios.fila;

import java.util.Arrays;

public class FilaFIFO {

    private int[] capacidade;
    private int primeiro;
    private int ultimo;
    private int total;

    public FilaFIFO(int cap) {
        capacidade = new int[cap];
        primeiro = capacidade[0];
        ultimo = 0;
        total = 0;
    }

    public void enqueue (int elemento) {
        //Adiciona um inteiro a fila.
        if (isFull()) {
            throw new RuntimeException("Erro: lista cheia");
        } else {
            capacidade[ultimo] = elemento;
            ultimo = (ultimo + 1) % capacidade.length;
            total++;
        }
    }

    public int dequeue () {
        //Remove um inteiro da fila.
        if (isEmpty()) {
            throw new RuntimeException("Erro: lista vazia");
        } else {
            int elemento = capacidade[primeiro];
            primeiro = (primeiro + 1) % capacidade.length;
            total--;
            return elemento;
        }
    }

    public int rear () {
        //Retorna o inteiro que esta no fim da fila.
        if ( isFull()) {
            ultimo = capacidade[total-1];
        }
        return ultimo;
    }

    public int front () {
        //Retorna o inteiro que esta na frente da fila.
        return capacidade[primeiro];
    }

    public int size () {
        //Retorna o tamanho da fila.
        return total;
    }

    public Boolean isEmpty () {
        //Retorna true ou false dependendo da fila esta vazia ou nao.
        return total == 0;
    }

    public Boolean isFull () {
        return total == capacidade.length;
    }

    @Override
    public String toString() {
        return "FilaFIFO{" +
                "capacidade=" + Arrays.toString(capacidade) +
                ", primeiro=" + front() +
                ", ultimo=" + rear() +
                ", total=" + size() +
                '}';
    }

}
