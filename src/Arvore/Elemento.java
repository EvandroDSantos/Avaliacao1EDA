/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arvore;

/**
 *
 * @author Dos SanTos
 */
public class Elemento {
    private char valor;
    private Elemento proximo;
    private Elemento esquerda;
    private Elemento direita;
    
    public Elemento(char valor){
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(char valor) {
        this.valor = valor;
    }

    public Elemento getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Elemento esquerda) {
        this.esquerda = esquerda;
    }

    public Elemento getDireita() {
        return direita;
    }

    public void setDireita(Elemento direita) {
        this.direita = direita;
    }
}
