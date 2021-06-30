package br.edu.univas;

public class Arvore {
    private No raiz;

    public Arvore(String n) {
        this.raiz = new No(n);
    }

    public Arvore() {
        
    }

    public No getRaiz() {
        return raiz;
    }

    public No buscar(String procurado) {
        No achado = raiz.buscar(procurado);
        return achado;
    }

}
