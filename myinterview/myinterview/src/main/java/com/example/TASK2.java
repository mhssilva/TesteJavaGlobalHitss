package com.example;
import java.util.LinkedList;

/**
A tarefa aqui é escrever uma lista. Cada elemento deve conhecer o elemento antes e
 * depois disso. Imprima sua lista e remova o elemento no meio
 * a lista. Imprima novamente.
 *
 * 
 */
public class TASK2 {
	
	
	public static void main(String[] args) {

        LinkedList<Integer> numeros = new LinkedList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

        System.out.println("Lista de números: \n" + numeros);
        
        int posicaoParaRemover = numeros.size() / 2;
        int indiceElementoMeio = (int) posicaoParaRemover;

        if (numeros.size() % 2 == 0) {
            numeros.remove(indiceElementoMeio - 0);
        } 
        else {
            numeros.remove(indiceElementoMeio);
        }
     
        System.out.println("Lista sem o número do meio: \n" + numeros);
     
    }
	   
	    
}
