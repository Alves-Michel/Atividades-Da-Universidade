import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        Scanner scanner = inputHandler.getScanner();

        ContadorVogais contagem = new ContadorVogais();
        contagem.contador(scanner);

        System.out.println("------------------------------------------------------------");
        Palindrono palindrinho = new Palindrono();
        palindrinho.verificarPalindromo(scanner);

        System.out.println("------------------------------------------------------------");
        Temperatura converter = new Temperatura();
        converter.calculoTemperatura(scanner);

        System.out.println("------------------------------------------------------------");
        NumerosPrimos primos = new NumerosPrimos();
        primos.verificarNumerosPrimos(scanner);

        System.out.println("------------------------------------------------------------");
        SomaDeDigitos somadigitos = new SomaDeDigitos();
        somadigitos.digitos(scanner);


    }
}