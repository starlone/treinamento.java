/*
    Construa um algoritmo que leia um número inteiro de horas e mostre ao 
    usuário a quantos minutos e quantos segundos estas horas correspondem
*/
class Exercicio01{
    public static void main(String[] args){
        int horas = 10;
        int minutos = horas * 60;
        int segundos = minutos * 60;

        System.out.println("Horas:    " + horas);
        System.out.println("Minutos:  " + minutos);
        System.out.println("Segundos: " + segundos);
    }
}
