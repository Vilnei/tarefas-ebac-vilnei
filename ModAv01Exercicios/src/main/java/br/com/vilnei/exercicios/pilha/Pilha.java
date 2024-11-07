package br.com.vilnei.exercicios.pilha;

import java.util.Arrays;

public class Pilha {

    private int elemento[];
    private int topo;
    private int tamanho;

    public Pilha () {
        //cria uma pilha pre-configurado com capacidade de 10 elementos com o topo sendo invalido e com 0 elementos
        elemento = new int[10];
        topo = -1;
        tamanho = 0;
    }

    public void push (int elemento) {
        //Coloca um inteiro no topo da pilha
        topo++;
        this.elemento[topo] = elemento;
        tamanho++;
    }

    public int pop () {
        //Remove o valor do topo da pilha e o retorna ao chamado
        int elemento;
        elemento = this.elemento[topo];
        topo--;
        this.tamanho--;

        return elemento;
    }

    public int top () {
        //Espia o inteiro que esta no topo e o retorna sem mexer na pilha
        return this.elemento[topo];
    }

    public Boolean isEmpty() {
        //Retorna true ou false dependendo da pilha estar vazia ou não.
        return (topo == -1);
    }

    public int size () {
        //Retorna um valor inteiro com o numero de elementos da pilha.
        return tamanho;
    }

    @Override
    public String toString() {
        return "Pilha{" +
                "elemento=" + Arrays.toString(elemento) +
                ", topo=" + topo +
                ", tamanho=" + tamanho +
                '}';
    }

}
