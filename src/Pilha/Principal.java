/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pilha;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Dos SanTos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack p = new Stack();
        
        p.push(0);
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        p.push(3);
        p.push(6);
        p.push(7);
        p.push(8);
        p.push(7);
        
        
        for (int i = 0; i < 10; i++) {
            System.out.println(p.pop());
        }
    }
    
}
