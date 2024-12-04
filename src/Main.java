public class Main {
    public static void main(String[] args) {

        // 2 - Faça um laço de repetição utilizando for que imprime na tela os números de um vetor com 5 elementos
        int[] numeros = {4, 8, 15, 16, 23};

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

    }
}