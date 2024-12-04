import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 15, 16, 23};


        // 2 - Faça um laço de repetição utilizando for que imprime na tela os números de um vetor com 5 elementos
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println(" ");
        // 3 - Faça um laço de repetição utilizando while que imprime na tela os números de um vetor com 5 elementos
        int i = 0;
        while (i < numeros.length) {
            System.out.println(numeros[i] + " ");
            i++;
        }

        System.out.println(" ");
        // 4 - Faça um laço de repetição utilizando do/while que imprime na tela os números de um vetor com 5 elementos

        do {
            for ( i = 0; i < numeros.length; i++) {
                System.out.println(numeros[i]);
            }
        } while (i < numeros.length);

        /* Crie um programa que recebe como input o nome de uma pessoa e a data de nascimento.
        A partir desses dados, o programa deve calcular quantos anos a pessoa tem e a saída
        deve ser o nome que a pessoa digitou e a idade dessa pessoa.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Agora, digite seu ano de nascimento:");
        int anoNascimento = scanner.nextInt();

        Calendar calendario = Calendar.getInstance();
        int anoAtual = calendario.get(Calendar.YEAR);

        int idade = anoAtual - anoNascimento;
        scanner.close();
        System.out.println("Olá! " + nome + "! " + "Sua idade no ano de " + anoAtual + " é " + idade + "!");


    }
}