class Procedimento{
    public static void main(String[] args){
        imprimeRaiz(2);
        imprimeRaiz(4);
    }

    public static double calculaRaiz(double numero){
        return numero * numero;
    }

    public static void imprimeRaiz(double numero){
        double raiz = calculaRaiz(numero);
        System.out.println("Raiz de " + numero + ": " + raiz );
    }
}
