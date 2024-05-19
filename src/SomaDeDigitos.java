import java.util.Scanner;

public class SomaDeDigitos {
    public void digitos(Scanner reader) {

        int soma = 0, unidade = 0;
        System.out.println("Digite um numero");
        int number = reader.nextInt();
        String contador = Integer.toString(number);

        for(int i = 1; i <= contador.length(); i++){
            unidade = number % 10;
            number /= 10;
            soma += unidade;
        }
        System.out.println("A soma dos digitos: "+soma);
    }
}
