package exercicios;

import java.util.Scanner;

/*
    Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja 
    inválido e continue pedindo até que o usuário informe um valor válido.
*/
class Exercicio12{
    public static void main(String[] args){
    	
    	Scanner teclado = new Scanner(System.in);
    	
    	System.out.print("Informe uma nota de 0 à 10: ");
    	int nota = teclado.nextInt();
    	
    	while(nota < 0 || nota > 10){
    		System.out.print("Nota inválida. Informe novamente uma nota de 0 à 10: ");
    		nota = teclado.nextInt();
    	}
    	
    	System.out.println("Nota: " + nota);
       
    }
}
