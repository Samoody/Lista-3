import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[30];
        int soma = 0;

        for (int i = 0; i < 30; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 5 == 0) {
                soma += numeros[i];
            }
        }

        System.out.println("\nSoma dos múltiplos de 5: " + soma);
        sc.close();
    }
}
