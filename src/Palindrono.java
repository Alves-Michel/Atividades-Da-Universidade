import java.util.Scanner;

public class Palindrono {
    public void verificarPalindromo(Scanner reader){

        System.out.println("Digite uma palavra: ");
        String palavra = reader.nextLine();
        palavra = palavra.replace(" "," ").toLowerCase();
        String palindromo = "";

        for (int i = palavra.length() - 1; i >= 0; i--){
            palindromo += palavra.charAt(i);
        }
        if(palindromo.equals(palavra)){
            System.out.println("é um palindromo! = " + palindromo);
        }else System.out.println("Nao é um palindromo! = "+ palindromo);
    }
}
