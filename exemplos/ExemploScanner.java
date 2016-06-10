import java.util.Scanner;

class ExemploScanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Bem vindo ");
        System.out.println(nome);

    }
}
