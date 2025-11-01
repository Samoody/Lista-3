import java.util.Scanner;
import java.util.HashMap;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        HashMap<Integer, Integer> contador = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int num = sc.nextInt();
            numeros[i] = num;
            contador.put(num, contador.getOrDefault(num, 0) + 1);
        }

        System.out.println("\nFrequência dos números:");
        for (int num : contador.keySet()) {
            System.out.println(num + " aparece " + contador.get(num) + " vez(es)");
        }
        sc.close();
    }
}
