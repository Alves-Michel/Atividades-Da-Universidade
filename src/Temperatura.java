import java.util.Scanner;

public class Temperatura{

        public void calculoTemperatura(Scanner reader) {

            double celsius = 0, fahrenheit = 0;

            System.out.println("Quantos graus esta fazendo hoje?");
            double graus = reader.nextDouble();
            System.out.println("Em °C ou °F");
            String tipoGrau = reader.next();

            if (tipoGrau.equalsIgnoreCase("C") || tipoGrau.equalsIgnoreCase("Celsius")) {
                fahrenheit = (graus * 1.8) + 32;
                System.out.println(graus + "°C, em Fahrenheit = " + fahrenheit + "°F");
            } else if (tipoGrau.equalsIgnoreCase("F") || tipoGrau.equalsIgnoreCase("fahrenheit")) {
                celsius = (graus - 32) * 5 / 9;
                System.out.println(graus + "°F, em Celsius = " + celsius + "°C");
            }
        }
}
