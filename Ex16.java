import java.util.Scanner;

public class Ex16 {
    public static long fatorial(int n) {
        if (n <= 1) return 1;
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        System.out.println("Fatorial de " + n + " = " + fatorial(n));
        sc.close();
    }
}
