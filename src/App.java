import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        //****** */ Crie um programa que receba um número e diga se ele é maior ou menor que zero


        // System.out.println("Insira um número que darei uma informação sobre ele");
        // int input = scan.nextInt();

        // if(input > 0){

        //     System.out.println("O número é maior que zero!");

        // }else if(input < 0){

        //     System.out.println("O número é menor que zero");

        // }else{

        //     System.out.println("O número é igual a zero");

        // }

        //*****Crie um programa que receba um número interio e informe todos os números entre ele e 0

        // System.out.println("Insira um número que farei uma contagem");
        // int numero = scan.nextInt();

        // for(int i = 0; i < numero; i++)
        // {
        //     System.out.println(numero - i);
        // }

        // //começa negativo
        // for (int i = numero; i < 0; i++)
        // {
        //     System.out.println(numero + (i * -1) );

        // }

        //Crie um programa que informe se o número é par ou impar

        int numero = scan.nextInt();

        if(numero % 2 == 0){
            System.out.println("o numero é par");

        }
        else{
            System.out.println("O número é impar");
        }

        



        scan.close();

    }
}
