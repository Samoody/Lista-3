public class Ex18 {
    public static int somaVetor(int[] v, int i) {
        if (i == v.length - 1) return v[i];
        return v[i] + somaVetor(v, i + 1);
    }

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        System.out.println("Soma dos elementos = " + somaVetor(vetor, 0));
    }
}
