/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arvore;

/**
 *
 * @author Evandro Dos SanTos
 */
public class ArvoreBinaria {
    private Elemento raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public Elemento getRaiz() {
        return raiz;
    }

    public void setRaiz(Elemento raiz) {
        this.raiz = raiz;
    }
    
    public void adicionarElemento(char valor){
        Elemento novoElemento = new Elemento(valor);
        
        if(raiz == null){
            this.raiz = novoElemento;
        }else{
            Elemento actual = this.raiz;
            
            while(true){
                if (novoElemento.getValor() < actual.getValor()) {
                    if (actual.getEsquerda() != null) {
                        actual = actual.getEsquerda();
                    }else{
                        actual.setEsquerda(novoElemento);
                        break;
                    }
                }else{
                    if (actual.getDireita()!= null) {
                        actual = actual.getDireita();
                    }else{
                        actual.setDireita(novoElemento);
                        break;
                    }
                }
            }
        }
    }
     
    public void infixa(Elemento actual){
        if (actual != null) {
            infixa(actual.getEsquerda());
            System.out.println(actual.getValor());
            infixa(actual.getDireita());
        } 
    }
    
}
