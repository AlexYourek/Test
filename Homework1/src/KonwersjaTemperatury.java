import java.util.Scanner;

public class KonwersjaTemperatury {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj temperaturę w stopniach Celsjusza: ");
        double temperaturaCelsjusza = scanner.nextDouble();
        double temperaturaFahrenheita = (temperaturaCelsjusza * 9/5) + 32;
        System.out.println("Temperatura w stopniach Fahrenheita: " + temperaturaFahrenheita);

    }
}
