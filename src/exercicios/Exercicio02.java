/*
    Construa um algoritmo que calcule a área de uma circunferência cujo 
    raio é fornecido (use área= 3.14 x raio2)
*/
class Exercicio02{
    public static void main(String[] args){
        double raio = 60;
        double area = 3.14 * raio * raio;
        double area2 = 3.14 * Math.pow(raio, 2);

        System.out.println(area);
        System.out.println(area2);
    }
}
