import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
   
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        //Soma de média dos alunos

        // Double[] notas = new Double[3];
        // Double media = 0d;
        // for (int i = 0; i < 3; i++) {
            
        //     System.out.println("Insira a nota do "+ (i + 1) + "º aluno");

        //     for (int j = 0; j < notas.length; j++) {
        //         notas[j] = scan.nextDouble();
        //         media += notas[j];
        //     }

        //     System.out.println("A média foi de:  "+(media / notas.length));
        //     media = 0d;

        // }

        //Crie um programa que receba 5 numeros ordene 

        ArrayList<Double> numeros = new ArrayList<Double>();

        System.out.println("Insira cinco números");
        for (int i = 0; i < 5; i++) {
            
            numeros.add(scan.nextDouble());
        }

        double temp;
        for (int i = 0; i < numeros.size(); i++) {

            for (int j = i; j > 0; j--) {

                if(numeros.get(j-1) > numeros.get(j))
                {
                    temp = numeros.get(j-1);
                    numeros.set(j-1, numeros.get(j));
                    numeros.set(j,temp);
                   
                }
                else{
                    break;
                }
            }
            for(Double numero : numeros){

                System.out.println(numero);
            }
            System.out.println(numeros.getFirst() + numeros.getLast());
        }

        //numeros.sort(null);

        scan.close();
    }
    
}
