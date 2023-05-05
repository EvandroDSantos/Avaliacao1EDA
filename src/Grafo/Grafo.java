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
public class Grafo {
    private ArrayList<Vertice> vertice;
    private ArrayList<Aresta> aresta;

    public Grafo() {
        this.vertice = new ArrayList<>();
        this.aresta = new ArrayList<>();
    }

    public ArrayList<Vertice> getVertice() {
        return vertice;
    }

    public void setVertice(ArrayList<Vertice> vertice) {
        this.vertice = vertice;
    }

    public ArrayList<Aresta> getAresta() {
        return aresta;
    }

    public void setAresta(ArrayList<Aresta> aresta) {
        this.aresta = aresta;
    }
    
    public void adicionarVertice(int elemento){
        Vertice novoVertice = new Vertice(elemento);
        this.vertice.add(novoVertice);
    }
    
    public void adicionarAresta(int peso, int elementoInicio, int elementoFim){
        
        Vertice inicio = this.recuperarVertice(elementoInicio);
        Vertice fim = this.recuperarVertice(elementoFim);
        Aresta arest = new Aresta(peso, inicio, fim);
        
        inicio.adicionaArestaSAida(arest);
        fim.adicionaArestaEntrada(arest);
        
        this.aresta.add(arest);
    }
    
    public Vertice recuperarVertice(int elemento){
        Vertice vertice1 = null;
        for (Vertice vert : this.vertice) {
            if (vert.getElemento() == elemento) {
                vertice1 = vert; 
                break;
            }
        }
        
        return vertice1;
    }
    
    public void buscaLargura(){
        ArrayList<Vertice> marcados = new ArrayList<>();
        ArrayList<Vertice> fila = new ArrayList<>();
        Vertice actual = this.vertice.get(0);
        marcados.add(actual);
        System.out.println(actual.getElemento());
        fila.add(actual);
        while (true) {
        Vertice visitado = fila.get(0);
            for (int i = 0; i < visitado.getArestaSaida().size(); i++) {
                Vertice proximo = visitado.getArestaSaida().get(i).getFim();
                if(!marcados.contains(proximo)){
                    marcados.add(proximo);
                    System.out.println(proximo.getElemento());
                    fila.add(proximo);
                }
            }fila.remove(0);
            
        }
    }
}
