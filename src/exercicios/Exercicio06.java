package exercicios;

/*
    Construa um algoritmo que calcule a média aritmética de 3 números quaisquer fornecidos
*/
public class Exercicio06{
    public static void main(String[] args){
        double valor = -15;
        
        // Resposta 1        
        if(valor > 0){
        	System.out.println("Positivo!");
        } else {
        	System.out.println("Negativo!");
        }
        
        // Resposta 2
        if(valor > 0){
        	System.out.println("Positivo!");
        } else {
        	if(valor < 0){
        		System.out.println("Negativo!");
        	} else {
        		System.out.println("Neutro!");
        	}
        }
        
        // Resposta 3
        if(valor > 0){
        	System.out.println("Positivo!");
        } else if(valor < 0){
    		System.out.println("Negativo!");
    	} else {
    		System.out.println("Neutro!");
        }
        
    }
}
