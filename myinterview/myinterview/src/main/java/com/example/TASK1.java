package com.example;

/**
 * 
 *
 * A tarefa aqui é implementar uma função que diz se uma determinada string é
 * palíndromo.
 *
 *
 *
 * Definição=> Um palíndromo é uma palavra, frase, número ou outra sequência de
 * caracteres que são lidos da mesma forma para frente e para trás, como madame ou
 * carro de corrida.
 * 
 */


public class TASK1 {

private static int i;

public static void main(String[] args) {
    String texto = "ANA";
    String aux = "";
    System.out.print("A Palavra: " +texto);
    aux = new StringBuffer(texto).reverse().toString();
    if (texto.equals(aux)) {
    System.out.println("  é palindrome");
    } else {
    System.out.println(" Não é Palindrome");
    }

}

public static int getI() {
	return i;
}

public static void setI(int i) {
	TASK1.i = i;
}
}