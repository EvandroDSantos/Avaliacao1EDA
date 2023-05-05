/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arvore;

/**
 *
 * @author Dos SanTos
 */
public class ExpressaoAritmetica {

    public static void main(String[] args) {
               
        ArvoreBinaria arvore = new ArvoreBinaria();
        
        arvore.adicionarElemento('A');
        arvore.adicionarElemento('C');
        arvore.adicionarElemento('B');
        arvore.adicionarElemento('D');
        arvore.adicionarElemento('E');
        arvore.adicionarElemento('F');
        arvore.adicionarElemento('G');
        arvore.adicionarElemento('H');
        arvore.adicionarElemento('I');
        arvore.adicionarElemento('J');
        arvore.adicionarElemento('K');
        arvore.adicionarElemento('L');
        arvore.adicionarElemento('M');
        arvore.adicionarElemento('N');
        arvore.adicionarElemento('O');
        arvore.adicionarElemento('P');
        arvore.adicionarElemento('Q');
        arvore.adicionarElemento('R');
        arvore.adicionarElemento('S');
        arvore.adicionarElemento('T');
        arvore.adicionarElemento('U');
        arvore.adicionarElemento('V');
        arvore.adicionarElemento('W');
        arvore.adicionarElemento('X');
        arvore.adicionarElemento('Y');
        arvore.adicionarElemento('Z');
        
        
    }
    
    static int exp(ArvoreBinaria a){
        int [] variaveis = new int[26];
        int exp = 0;
        
        for (int i = 0; i < 26; i++) {
            //variaveis[i] = a.infixa(a.getRaiz());
        }
        
        
        
        for (int i = 0; i < 26; i++) {
            exp = ((variaveis[i]+variaveis[i])*variaveis[i]);
        }
        
        return 0;
    }
    
}
