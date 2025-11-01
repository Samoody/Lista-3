public class Ex10 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) matriz[i][j] = 0;
                else if (i < j) matriz[i][j] = 1;
                else matriz[i][j] = -1;
            }
        }

        System.out.println("Matriz 5x5:");
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
}
