package com.example;
import java.util.LinkedList;

/**
 * Escreva uma lista e adicione um número aleatório de Strings. No final, imprima como
 * muitos itens distintos existem na lista.
 *
 */
public class TASK3 {
	public static void main(String[] args) {

        LinkedList<String> nomes = new LinkedList<>();
        nomes.add("ASD");
        nomes.add("DFG");
        nomes.add("CSD");
        nomes.add("FGP");
        nomes.add("ASD");
        nomes.add("APG");

        System.out.println("Todos os nomes da lista: \n" + nomes);

        LinkedList<String> uniqueNames = new LinkedList<>();

        for (int i = 0; i < nomes.size(); i++) {
            if (!uniqueNames.contains(nomes.get(i))) {
                uniqueNames.add(nomes.get(i));
            }
        }

        System.out.println("Existem " + uniqueNames.size() + " nomes únicos na lista.");
        System.out.println(uniqueNames);
    }
}
