/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafo;

import java.util.ArrayList;

/**
 *
 * @author Dos SanTos
 */
public class Vertice {
    private int elemento;
    private ArrayList<Aresta> arestaEntrada;
    private ArrayList<Aresta> arestaSaida;

    public Vertice(int valor) {
        this.elemento = valor;
        this.arestaEntrada = new ArrayList<>();
        this.arestaSaida = new ArrayList<>();
    }
    
    public void adicionaArestaEntrada(Aresta entrada){
        this.arestaEntrada.add(entrada);
    }
    
    public void adicionaArestaSAida(Aresta saida){
        this.arestaSaida.add(saida);
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public ArrayList<Aresta> getArestaEntrada() {
        return arestaEntrada;
    }

    public void setArestaEntrada(ArrayList<Aresta> arestaEntrada) {
        this.arestaEntrada = arestaEntrada;
    }

    public ArrayList<Aresta> getArestaSaida() {
        return arestaSaida;
    }

    public void setArestaSaida(ArrayList<Aresta> arestaSaida) {
        this.arestaSaida = arestaSaida;
    }
}
