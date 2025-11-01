import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] original = new int[15];
        int[] inverso = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            original[i] = sc.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            inverso[i] = original[14 - i];
        }

        System.out.println("\nVetor invertido:");
        for (int n : inverso) {
            System.out.print(n + " ");
        }
        sc.close();
    }
}
