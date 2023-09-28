import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println
                ("**********************************\n" + "Bem vindo ao jogo de adivinhação!!\n" + "**********************************\n");

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int randomNumber = random.nextInt(100);

        System.out.println("Escolha sua dificuldade: \n" + "[1]Fácil [2]Médio [3]Difícil");
        int attempt = input.nextInt();
        int guess
                = 0;

        if (attempt == 1) {
            attempt = 15;
        } else if (attempt == 2) {
            attempt = 10;
        } else if (attempt == 3) {
            attempt = 5;
        } else {
            System.out.println("Valor inválido, dificuldade média selecionada!\n");
        }

        for (int i = 0; i < attempt; i++) {

            System.out.println("\nEscolha um número entre 1 e 100: ");
            guess = input.nextInt();

            if (guess == randomNumber) {
                System.out.println("Parabéns você ganhou!!");
                break;
            } else if (guess > randomNumber && guess <= 100) {
                System.out.println("\nNúmero muito alto " + (attempt - i - 1) + " tentativas restantes!");
            } else if (guess < randomNumber && guess >= 1) {
                System.out.println("\nNúmero muito baixo " + (attempt - i - 1) + " tentativas restantes!");
            } else {
                System.out.println("\nValor inválido " + (attempt - i - 1) + " tentativas restantes!");
            }
        }

        if (guess == randomNumber) {
            System.out.println("\nFim de jogo!");
        } else {
            System.out.println("\nTentativas excedidas, o número secreto era " + randomNumber);
        }
    }
}
