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

    }
}