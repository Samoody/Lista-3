import java.util.Scanner;

public class Ex17 {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o termo n da sequência de Fibonacci: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
        sc.close();
    }
}
