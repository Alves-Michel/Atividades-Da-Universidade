import java.util.Scanner;

public class ContadorVogais {

        public void contador(Scanner reader){

        int  contador = 0;
        System.out.println("Digite uma palavra: ");
        String vogais = reader.nextLine();
        String letra = "";
        vogais = vogais.toLowerCase();

        for(int i = 0; i < vogais.length(); i++){
            if(     vogais.charAt(i) == 'a' ||
                    vogais.charAt(i) == 'e' ||
                    vogais.charAt(i) == 'i' ||
                    vogais.charAt(i) == 'o' ||
                    vogais.charAt(i) == 'u'){
                    letra += vogais.charAt(i);
                contador++;
            }
        }
        System.out.println("Número de vogais é de: "+contador);
        System.out.println("As vogais que compõem a palavra: " + letra);
    }
}
