/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arvore;

/**
 *
 * @author Dos SanTos
 */
public class Percursos {
       
    public void infixa(Elemento actual){
        if (actual != null) {
            infixa(actual.getEsquerda());
            System.out.println(actual.getValor());
            infixa(actual.getDireita());
        } 
    }
    
    public void prefixa(Elemento actual){
        if (actual != null) {
            System.out.println(actual.getValor());
            prefixa(actual.getEsquerda());
            prefixa(actual.getDireita());
        } 
    }
    
    public void sufixa(Elemento actual){
        if (actual != null) {
            sufixa(actual.getEsquerda());
            sufixa(actual.getDireita());
            System.out.println(actual.getValor());
        } 
    }
    
}
