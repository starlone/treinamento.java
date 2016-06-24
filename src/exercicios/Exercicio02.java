package exercicios;

/*
    Construa um algoritmo que calcule a área de uma circunferência cujo 
    raio é fornecido (use área= 3.14 x raio2)
*/
class Exercicio02{
    public static void main(String[] args){
        double raio = 60;
        
        // Resposta 1
        double area = 3.14 * raio * raio;
        System.out.println("Área: " + area);
        
        // Resposta 2        
        double area2 = 3.14 * Math.pow(raio, 2);
        System.out.println("Área: " + area2);
    }
}
