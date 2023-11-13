import java.util.Scanner;

public class ProstyKalkulator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while(true){
                System.out.println("Podaj pierwsza liczbe: ");
                double liczba1 = scanner.nextDouble();
                System.out.println("Podaj druga liczbe:");
                double liczba2 = scanner.nextDouble();

                System.out.println("wybierze akcje");
                System.out.println("1 - dodawanie");
                System.out.println("2 - odejmowanie");
                System.out.println("3 - mnozenie");
                System.out.println("4 - dzielenie");
                System.out.println("0 - zakoncz program");

                int wybor = scanner.nextInt();

                if(wybor == 0){
                    System.out.println("zakoncz program.");
                    System.exit(0);
                }

                double wynik = 0;

                if(wybor == 1){
                    wynik = liczba1 + liczba2;
                }else if(wybor ==2){
                    wynik = liczba1 - liczba2;
                }else if (wybor ==3){
                    wynik = liczba1*liczba2;
                }else if (wybor ==4){
                    wynik = liczba1 / liczba2;
                }else{
                    continue;
                }
                System.out.println("Twoj wynik: " + wynik);
            }
    }
}