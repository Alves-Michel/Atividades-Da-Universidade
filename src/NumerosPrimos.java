import java.util.Scanner;

public class NumerosPrimos {
    public void verificarNumerosPrimos(Scanner reader){
        System.out.print("Digite o início do intervalo: ");
        int inicio = reader.nextInt();

        System.out.print("Digite o fim do intervalo: ");
        int fim = reader.nextInt();
        // Verifica e imprime números primos no intervalo
        System.out.println("Números primos no intervalo de " + inicio + " a " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            // Verificar se o número é primo dentro do laço
            int isPrimo = 1; // Inicialmente assume que o número é primo
            if (i <= 1) {
                isPrimo = 0; // Números menores ou iguais a 1 não são primos
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrimo = 0; // Encontrou um divisor, então não é primo
                        break;
                    }
                }
            }
            if (isPrimo == 1) {
                System.out.println(i);
            }
        }
    }
}
