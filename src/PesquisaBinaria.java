import java.util.Arrays;
import java.util.Scanner;

public class PesquisaBinaria {
    public static void main(String[] args) {

        int tamanho = 100;
        int[] V = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            V[i] = tamanho - i;
        }

        boolean sair = true;
        tamanho = V.length;
        while (sair) {
            sair = false;
            for (int i = 0; i < tamanho - 1; i++) {
                if (V[i] > V[i + 1]) {
                    int aux = V[i];
                    V[i] = V[i + 1];
                    V[i + 1] = aux;
                    sair = true;
                }
            }
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Número: ");
        int num = input.nextInt();
        int ini = 0;
        int fim = tamanho - 1;
        int pos = -1;

        while (!sair && ini <= fim) {
            int meio = ((ini + fim) / 2);
            if (V[meio] == num) {
                pos = meio;
                sair = true;
            } else if (num < V[meio]) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }
        System.out.println("O número que você escolheu é " + num + " e sua posição é " + pos);
    }
}
